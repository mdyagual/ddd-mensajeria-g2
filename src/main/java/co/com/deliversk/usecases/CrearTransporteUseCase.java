package co.com.deliversk.usecases;

import co.com.deliversk.domain.transporte.Transporte;
import co.com.deliversk.domain.transporte.command.CrearTransporte;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearTransporteUseCase extends UseCase<RequestCommand<CrearTransporte>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearTransporte> input) {
        var command = input.getCommand();
        //aplicar reglas de negocio
        var transporte = new Transporte(command.getTransporteId(), command.getConductorId());
        emit().onResponse(new ResponseEvents(transporte.getUncommittedChanges()));
    }
}
