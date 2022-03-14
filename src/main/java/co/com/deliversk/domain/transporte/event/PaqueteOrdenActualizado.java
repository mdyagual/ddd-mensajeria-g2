package co.com.deliversk.domain.transporte.event;

import co.com.deliversk.domain.transporte.valor.Paquete;
import co.com.sofka.domain.generic.DomainEvent;

public class PaqueteOrdenActualizado extends DomainEvent {
    private final Paquete paquete;
    
    public PaqueteOrdenActualizado(Paquete paquete) {
        super("transporte.paqueteordenactualizado");
        this.paquete = paquete;
    }



    public Paquete getPaquete() {
        return paquete;
    }

    
}
