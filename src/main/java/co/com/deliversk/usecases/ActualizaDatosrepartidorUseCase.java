package co.com.deliversk.usecases;

import co.com.deliversk.domain.Repartidor.Repartidor;
import co.com.deliversk.domain.Repartidor.command.ActualizarDatosDelRepartidor;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class ActualizaDatosrepartidorUseCase extends UseCase<RequestCommand<ActualizarDatosDelRepartidor>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarDatosDelRepartidor> input) {
        var command = input.getCommand();
        var repartidor = Repartidor.from(command.getRepartidorId(), retrieveEvents());

        repartidor.actualizarDatos(command.getDatos());
        emit().onResponse(new ResponseEvents(repartidor.getUncommittedChanges()));
    }
}
