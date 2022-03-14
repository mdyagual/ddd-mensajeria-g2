package co.com.deliversk.usecases;


import co.com.deliversk.domain.conductor.Conductor;
import co.com.deliversk.domain.conductor.comando.ActualizarDatosDelConductor;
import co.com.deliversk.domain.conductor.event.ConductorCreado;
import co.com.deliversk.domain.conductor.event.DatosActualizadosDelConductor;
import co.com.deliversk.domain.conductor.valor.ConductorID;
import co.com.deliversk.domain.conductor.valor.Datos;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ActualizarDatosUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    void actualizarDatosOfConductor() {
        //arrange
        ConductorID conductorID = ConductorID.of("666XD");
        Datos datosUpdated = new Datos("Jessica", "Jhonsom", 24);

        var command = new ActualizarDatosDelConductor(conductorID,datosUpdated); //
        var usecase = new ActualizarDatosDelConductorUseCase();

        Mockito.when(repository.getEventsBy("666XD"))
                .thenReturn(history());
        usecase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(conductorID.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (DatosActualizadosDelConductor) events.get(0);
        Assertions.assertEquals("deliversk.conductor.datosActualizados", event.type);
        Assertions.assertEquals("Jessica", event.getDatos().value().nombres());
        Assertions.assertEquals(24, event.getDatos().value().edad());

    }

    private List<DomainEvent> history() {
        Datos datos = new Datos("Jess", "Jnonson", 24);
       return List.of(
               new ConductorCreado(datos)
       );
    }


}
