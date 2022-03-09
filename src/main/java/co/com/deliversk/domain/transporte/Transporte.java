package co.com.deliversk.domain.transporte;

import co.com.deliversk.domain.transporte.event.OrdenEntregada;
import co.com.deliversk.domain.transporte.event.TransporteCreado;
import co.com.deliversk.domain.transporte.valor.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Map;

public class Transporte extends AggregateEvent<TransporteId> {
    protected Map<String,Orden> ordenes;
    protected List<Ruta> rutas;
    protected ConductorId conductorId;

    public Transporte(TransporteId transporteId, ConductorId conductorId) {
        super(transporteId);
        appendChange(new TransporteCreado(conductorId)).apply();
        subscribe(new TransporteEventChange(this));
    }

    private Transporte(TransporteId transporteId){
        super(transporteId);
        subscribe(new TransporteEventChange(this));
    }


    public static Transporte from(TransporteId transporteId, List<DomainEvent> events){
        var transporte = new Transporte(transporteId);
        events.forEach(transporte::applyEvent);
        return transporte;
    }

    public void crearOrden(OrdenId ordenId, Remitente remitente, Destinatario destinatario, Paquete paquete){
        appendChange(new OrdenCreada(ordenId, remitente, destinatario, paquete)).apply();
    }

    public void entregarOrden(OrdenId ordenId){
        appendChange(new OrdenEntregada(ordenId)).apply();
    }


    public Map<String,Orden> ordenes() {
        return ordenes;
    }
}
