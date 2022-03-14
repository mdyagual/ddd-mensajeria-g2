package co.com.deliversk.domain.transporte.event;

import co.com.deliversk.domain.transporte.valor.OrdenId;
import co.com.sofka.domain.generic.DomainEvent;

public class OrdenEliminada extends DomainEvent {
    private final OrdenId ordenId;

    public OrdenEliminada(String type, OrdenId ordenId) {
        super("transporte.ordeneliminada");
        this.ordenId = ordenId;
    }

    public OrdenId getOrdenId() {
        return ordenId;
    }

    

    
    
}
