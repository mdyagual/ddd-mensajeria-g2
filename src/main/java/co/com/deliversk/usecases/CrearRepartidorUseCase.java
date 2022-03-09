package co.com.deliversk.usecases;

import co.com.deliversk.domain.Repartidor.Repartidor;
import co.com.deliversk.domain.Repartidor.command.CrearRepartidor;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearRepartidorUseCase extends UseCase<RequestCommand<CrearRepartidor>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearRepartidor> input) {
        var command = input.getCommand();
        var repartidor = new Repartidor(command.getRepartidorId(), command.getDatos());
        emit().onResponse(new ResponseEvents(repartidor.getUncommittedChanges()));
    }
}
