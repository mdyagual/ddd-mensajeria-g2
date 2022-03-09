package co.com.deliversk.domain.Repartidor;

import co.com.deliversk.domain.Repartidor.event.RepartidorCreado;
import co.com.deliversk.domain.Repartidor.valor.Datos;
import co.com.deliversk.domain.Repartidor.valor.RepartidorId;
import co.com.deliversk.domain.transporte.TransporteEventChange;
import co.com.sofka.domain.generic.AggregateEvent;


public class Repartidor extends AggregateEvent<RepartidorId> {
    protected Datos datos;

    private Repartidor(RepartidorId repartidorId){
        super(repartidorId);
        subscribe(new RepartidorEventChange(this));
    }

    public Repartidor (RepartidorId repartidorId, Datos datos){
        super(repartidorId);
        appendChange(new RepartidorCreado(datos)).apply();
        subscribe(new RepartidorEventChange(this));
    }

}
