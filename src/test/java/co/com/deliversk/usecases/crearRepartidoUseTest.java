package co.com.deliversk.usecases;

import co.com.deliversk.domain.Repartidor.command.CrearRepartidor;
import co.com.deliversk.domain.Repartidor.event.RepartidorCreado;
import co.com.deliversk.domain.Repartidor.valor.Datos;
import co.com.deliversk.domain.Repartidor.valor.RepartidorId;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class crearRepartidoUseTest {
    @Test
    @DisplayName("Testing crearRepartidor")
    void crearRepartidor() {

        RepartidorId repartidorId = new RepartidorId();
        Datos datos = new Datos("Harold", "Pelaez", 34);


        var command = new CrearRepartidor(repartidorId, datos);
        var usecase = new CrearRepartidorUseCase();

        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (RepartidorCreado)events.get(0);
        Assertions.assertEquals("deliversk.repartidor.repartidorcreado", event.type);
        Assertions.assertEquals("Harold",event.getDatos().value().nombres());
        Assertions.assertEquals(34,event.getDatos().value().edad());
    }
}
