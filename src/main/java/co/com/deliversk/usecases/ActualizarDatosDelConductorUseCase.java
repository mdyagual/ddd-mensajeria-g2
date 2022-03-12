package co.com.deliversk.usecases;

import co.com.deliversk.domain.conductor.Conductor;
import co.com.deliversk.domain.conductor.comando.ActualizarDatosDelConductor;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class ActualizarDatosDelConductorUseCase extends UseCase<RequestCommand<ActualizarDatosDelConductor>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ActualizarDatosDelConductor> input) {
        var command = input.getCommand();
        var conductor = Conductor.from(command.getConductorID(), retrieveEvents());

        conductor.actualizarDatos(command.getDatos());
        emit().onResponse(new ResponseEvents(conductor.getUncommittedChanges()));
    }
}
