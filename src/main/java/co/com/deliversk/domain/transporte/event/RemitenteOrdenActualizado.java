package co.com.deliversk.domain.transporte.event;

import co.com.deliversk.domain.transporte.valor.Remitente;
import co.com.sofka.domain.generic.DomainEvent;

public class RemitenteOrdenActualizado extends DomainEvent{
    private final Remitente remitente;

    public RemitenteOrdenActualizado(String type, Remitente remitente) {
        super("transporte.remitenteordenactualizado");
        this.remitente = remitente;
    }

    public Remitente getRemitente() {
        return remitente;
    }

    

    
    
}
