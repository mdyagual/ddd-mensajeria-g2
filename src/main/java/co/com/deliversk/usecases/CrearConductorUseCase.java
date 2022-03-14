package co.com.deliversk.usecases;

import co.com.deliversk.domain.conductor.Conductor;
import co.com.deliversk.domain.conductor.comando.CrearConductor;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearConductorUseCase extends UseCase<RequestCommand<CrearConductor>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearConductor> input) {
        var command = input.getCommand();
        var conductor = new Conductor(command.getConductorID(), command.getDatos());
        emit().onResponse(new ResponseEvents(conductor.getUncommittedChanges()));
    }
}
