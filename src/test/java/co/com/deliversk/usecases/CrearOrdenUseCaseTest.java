package co.com.deliversk.usecases;

import co.com.deliversk.domain.transporte.event.OrdenCreada;
import co.com.deliversk.domain.transporte.command.CrearOrden;
import co.com.deliversk.domain.transporte.event.TransporteCreado;
import co.com.deliversk.domain.transporte.valor.*;
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
import java.util.logging.Handler;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CrearOrdenUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    void crearOrden(){
        //arrange
        TransporteId transporteId = TransporteId.of("xxxx");
        OrdenId ordenId = OrdenId.of("ffffff");
        Remitente remitente = new Remitente("Raul", "Alzate", "xxxxxx");
        Destinatario destinatario = new Destinatario("Pedro", "Sanchez", "fffff");
        Paquete paquete = new Paquete(50.0, "YYYYYY");
        var command = new CrearOrden( transporteId,  ordenId,  remitente,  destinatario, paquete);

        var usecase = new CrearOrdenUseCase();
        Mockito.when(repository.getEventsBy("xxxx")).thenReturn(history());
        usecase.addRepository(repository);
        //act

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(transporteId.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert

        var event = (OrdenCreada) events.get(0);
        Assertions.assertEquals("transporte.ordencreada", event.type);
        Assertions.assertEquals("ffffff", event.getOrdenId().value());
        //TODO: colocar las demas validaciones
    }

    private List<DomainEvent> history() {
        TransporteId transporteId = TransporteId.of("xxxx");
        OrdenId ordenId = OrdenId.of("ffffff");
        Remitente remitente = new Remitente("Raul", "Alzate", "xxxxxx");
        Destinatario destinatario = new Destinatario("Pedro", "Sanchez", "fffff");
        Paquete paquete = new Paquete(50.0, "YYYYYY");
        return List.of(
                new TransporteCreado(ConductorId.of("xxxx")),
                new OrdenCreada(ordenId, remitente, destinatario,paquete)
                
        );
    }

}