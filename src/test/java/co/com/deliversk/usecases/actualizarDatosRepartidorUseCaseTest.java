package co.com.deliversk.usecases;

import co.com.deliversk.domain.Repartidor.command.ActualizarDatosDelRepartidor;
import co.com.deliversk.domain.Repartidor.event.DatosActualizadosDelRepartidor;
import co.com.deliversk.domain.Repartidor.event.RepartidorCreado;
import co.com.deliversk.domain.Repartidor.valor.Datos;
import co.com.deliversk.domain.Repartidor.valor.RepartidorId;
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
public class actualizarDatosRepartidorUseCaseTest {
    @Mock
    private DomainEventRepository repository;

    @Test
    void actualizarDatosOfRepartidor() {

        RepartidorId repartidorId = RepartidorId.of("666XD");
        Datos datosUpdated = new Datos("Mariana", "Lopez", 20);

        var command = new ActualizarDatosDelRepartidor(repartidorId,datosUpdated); //
        var usecase = new ActualizaDatosrepartidorUseCase();

        Mockito.when(repository.getEventsBy("666XD"))
                .thenReturn(history());
        usecase.addRepository(repository);


        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(repartidorId.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();


        var event = (DatosActualizadosDelRepartidor) events.get(0);
        Assertions.assertEquals("deliversk.repartidor.datosActualizados", event.type);
        Assertions.assertEquals("Mariana", event.getDatos().value().nombres());
        Assertions.assertEquals(20, event.getDatos().value().edad());

    }

    private List<DomainEvent> history() {
        Datos datos = new Datos("Camila", "Perez", 20);
        return List.of(
                new RepartidorCreado(datos)
        );
    }
}
