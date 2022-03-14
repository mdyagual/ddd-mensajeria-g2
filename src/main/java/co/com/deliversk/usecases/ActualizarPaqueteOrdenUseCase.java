package co.com.deliversk.usecases;

import co.com.deliversk.domain.transporte.Transporte;
import co.com.deliversk.domain.transporte.command.ActualizarPaqueteOrden;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class ActualizarPaqueteOrdenUseCase extends UseCase<RequestCommand<ActualizarPaqueteOrden>, ResponseEvents>  {
    @Override
    public void executeUseCase(RequestCommand<ActualizarPaqueteOrden> input) {
        var command = input.getCommand();
        var transporte = Transporte.from(command.getTransporteId(), retrieveEvents());
        
        transporte.actualizarPaquete(command.getOrdenId(),command.getPaquete());
        emit().onResponse(new ResponseEvents(transporte.getUncommittedChanges()));
    }

}
