package co.com.deliversk.domain.Repartidor.command;

import co.com.deliversk.domain.Repartidor.valor.Datos;
import co.com.deliversk.domain.Repartidor.valor.RepartidorId;
import co.com.sofka.domain.generic.Command;

public class ActualizarDatosDelRepartidor extends Command {
    private final RepartidorId repartidorId;
    private final Datos datos;

    public ActualizarDatosDelRepartidor (RepartidorId repartidorId, Datos datos) {
        this.repartidorId = repartidorId;
        this.datos = datos;
    }

    public RepartidorId getRepartidorId() {
        return repartidorId;
    }

    public Datos getDatos() {
        return datos;
    }
}
