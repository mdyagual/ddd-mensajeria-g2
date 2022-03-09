package co.com.deliversk.usecases;

import co.com.deliversk.domain.Repartidor.Repartidor;
import co.com.deliversk.domain.Repartidor.command.CrearRepartidor;
import co.com.deliversk.domain.Repartidor.event.RepartidorCreado;
import co.com.deliversk.domain.Repartidor.valor.Datos;
import co.com.deliversk.domain.Repartidor.valor.RepartidorId;
import co.com.deliversk.domain.transporte.command.CrearTransporte;
import co.com.deliversk.domain.transporte.event.TransporteCreado;
import co.com.deliversk.domain.transporte.valor.ConductorId;
import co.com.deliversk.domain.transporte.valor.Dato;
import co.com.deliversk.domain.transporte.valor.TransporteId;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CrearRepartidorUseCaseTest {

    @Test
    void CrearRepartidor(){
        RepartidorId repartidorId = new RepartidorId();
        Datos datos = new Datos("Mariana", "Lopez", 20);
        var command = new CrearRepartidor(repartidorId,datos);
        var usecase = new CrearRepartidorUseCase();

        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event = (RepartidorCreado)events.get(0);
        Assertions.assertEquals("deliversk.repartidor.repartidorCreado", event.type);
        Assertions.assertEquals("Mariana",event.getDatos().value().nombres());
        Assertions.assertEquals(repartidorId.value(),event.aggregateRootId());
    }


}
