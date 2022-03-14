package co.com.deliversk.domain.transporte.event;

import co.com.deliversk.domain.transporte.valor.Destinatario;
import co.com.deliversk.domain.transporte.valor.OrdenId;
import co.com.sofka.domain.generic.DomainEvent;

public class DestinatarioOrdenActualizado extends DomainEvent {
    private final Destinatario destinatario;
    private final OrdenId ordenId;

    public DestinatarioOrdenActualizado(OrdenId ordenId,Destinatario destinatario) {
        super("transporte.destinatarioordenactualizado");
        this.ordenId = ordenId;
        this.destinatario = destinatario;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public OrdenId getOrdenId() {
        return ordenId;
    }

    

    
    
}
