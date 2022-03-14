package co.com.deliversk.domain.transporte.event;

import co.com.deliversk.domain.transporte.valor.Dato;
import co.com.sofka.domain.generic.DomainEvent;

public class DatosConductorActualizado extends DomainEvent {
    private final Dato datos;

    public DatosConductorActualizado(Dato datos) {
        super("transporte.datosconductoractualizado");
        this.datos = datos;
    }

    public Dato getDatos() {
        return datos;
    }

    

    
    
}
