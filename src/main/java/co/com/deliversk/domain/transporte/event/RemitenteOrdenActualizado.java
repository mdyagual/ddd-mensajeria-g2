package co.com.deliversk.domain.transporte.event;

import co.com.deliversk.domain.transporte.valor.OrdenId;
import co.com.deliversk.domain.transporte.valor.Remitente;
import co.com.sofka.domain.generic.DomainEvent;

public class RemitenteOrdenActualizado extends DomainEvent{
    private final Remitente remitente;
    private final OrdenId ordenId;

    public RemitenteOrdenActualizado(OrdenId ordenId, Remitente remitente) {
        super("transporte.remitenteordenactualizado");
        this.ordenId = ordenId;
        this.remitente = remitente;
    }

    public Remitente getRemitente() {
        return remitente;
    }

    public OrdenId getOrdenId() {
        return ordenId;
    }

    

    
    
}
