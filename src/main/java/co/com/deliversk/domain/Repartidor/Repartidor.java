package co.com.deliversk.domain.Repartidor;

import co.com.deliversk.domain.Repartidor.event.DatosActualizadosDelRepartidor;
import co.com.deliversk.domain.Repartidor.event.RepartidorCreado;
import co.com.deliversk.domain.Repartidor.valor.Datos;
import co.com.deliversk.domain.Repartidor.valor.RepartidorId;
import co.com.deliversk.domain.transporte.TransporteEventChange;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;


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

    public static Repartidor from(RepartidorId repartidorId, List<DomainEvent> events) {
        var repartidor = new Repartidor(repartidorId);
        events.forEach(repartidor::applyEvent);
        return repartidor;
    }


    public void actualizarDatos(Datos datos) {
        appendChange(new DatosActualizadosDelRepartidor(datos)).apply();
    }

}
