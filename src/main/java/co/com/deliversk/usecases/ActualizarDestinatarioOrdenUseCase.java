package co.com.deliversk.usecases;

import co.com.deliversk.domain.transporte.Transporte;
import co.com.deliversk.domain.transporte.command.ActualizarDestinatarioOrden;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;


public class ActualizarDestinatarioOrdenUseCase extends UseCase<RequestCommand<ActualizarDestinatarioOrden>, ResponseEvents>  {
    @Override
    public void executeUseCase(RequestCommand<ActualizarDestinatarioOrden> input) {
        var command = input.getCommand();
        var transporte = Transporte.from(command.getTransporteId(), retrieveEvents());
        
        transporte.actualizarDestinatario(command.getOrdenId(),command.getDestinatario());
        emit().onResponse(new ResponseEvents(transporte.getUncommittedChanges()));
    }
}
