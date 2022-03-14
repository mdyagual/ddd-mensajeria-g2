package co.com.deliversk.domain.transporte.event;

import co.com.deliversk.domain.transporte.valor.Destinatario;
import co.com.sofka.domain.generic.DomainEvent;

public class DestinatarioOrdenActualizado extends DomainEvent {
    private final Destinatario destinatario;

    public DestinatarioOrdenActualizado(Destinatario destinatario) {
        super("transporte.destinatarioordenactualizado");
        this.destinatario = destinatario;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    
    
}
