package co.com.deliversk.usecases;

import co.com.deliversk.domain.conductor.comando.CrearConductor;
import co.com.deliversk.domain.conductor.event.ConductorCreado;
import co.com.deliversk.domain.conductor.valor.ConductorID;
import co.com.deliversk.domain.conductor.valor.Datos;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CrearConductorUseCaseTest {

    @Test
    @DisplayName("Testing crearConductor")
    void crearConductor() {
        //arrange
        ConductorID conductorID = new ConductorID();
        Datos datos = new Datos("Alex", "Hernandez", 29);

        //act
        var command = new CrearConductor(conductorID, datos);
        var usecase = new CrearConductorUseCase();

        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (ConductorCreado)events.get(0);
        Assertions.assertEquals("deliversk.conductor.conductorCreado", event.type);
        Assertions.assertEquals("Alex",event.getDatos().value().nombres());
        Assertions.assertEquals("Hernandez",event.getDatos().value().apellidos());
        Assertions.assertEquals(29,event.getDatos().value().edad());
    }
}
