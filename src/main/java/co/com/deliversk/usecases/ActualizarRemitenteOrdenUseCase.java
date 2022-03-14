package co.com.deliversk.usecases;

import co.com.deliversk.domain.transporte.Transporte;
import co.com.deliversk.domain.transporte.command.ActualizarRemitenteOrden;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class ActualizarRemitenteOrdenUseCase extends UseCase<RequestCommand<ActualizarRemitenteOrden>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarRemitenteOrden> input) {
        var command = input.getCommand();
        var transporte = Transporte.from(command.getTransporteId(), retrieveEvents());
        
        transporte.actualizarRemitente(command.getOrdenId(),command.getRemitente());
        emit().onResponse(new ResponseEvents(transporte.getUncommittedChanges()));
    }

}
