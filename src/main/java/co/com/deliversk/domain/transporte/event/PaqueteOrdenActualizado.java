package co.com.deliversk.domain.transporte.event;

import co.com.deliversk.domain.transporte.valor.OrdenId;
import co.com.deliversk.domain.transporte.valor.Paquete;
import co.com.sofka.domain.generic.DomainEvent;

public class PaqueteOrdenActualizado extends DomainEvent {
    private final Paquete paquete;
    private final OrdenId ordenId;
    
    public PaqueteOrdenActualizado(OrdenId ordenId, Paquete paquete) {
        super("transporte.paqueteordenactualizado");
        this.ordenId = ordenId;
        this.paquete = paquete;
    }



    public OrdenId getOrdenId() {
        return ordenId;
    }



    public Paquete getPaquete() {
        return paquete;
    }

    
}
