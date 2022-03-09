package co.com.deliversk.domain.Repartidor.event;

import co.com.deliversk.domain.Repartidor.valor.Datos;
import co.com.deliversk.domain.Repartidor.valor.RepartidorId;
import co.com.sofka.domain.generic.DomainEvent;

public class RepartidorCreado extends DomainEvent {
    private final Datos datos;

    public RepartidorCreado(Datos datos){
        super("deliversk.repartidor.repartidorcreado");
        this.datos = datos;
    }

    public Datos getDatos() {
        return datos;
    }
}
