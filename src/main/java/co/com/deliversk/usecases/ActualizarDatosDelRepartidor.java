package co.com.deliversk.usecases;

import co.com.deliversk.domain.Repartidor.Repartidor;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class ActualizarDatosDelRepartidor extends UseCase<RequestCommand<co.com.deliversk.domain.Repartidor.command.ActualizarDatosDelRepartidor>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<co.com.deliversk.domain.Repartidor.command.ActualizarDatosDelRepartidor> input) {
        var command = input.getCommand();
        var conductor = Repartidor.from(command.getRepartidorId(), retrieveEvents());

        conductor.actualizarDatos(command.getDatos());
        emit().onResponse(new ResponseEvents(conductor.getUncommittedChanges()));
    }
}
