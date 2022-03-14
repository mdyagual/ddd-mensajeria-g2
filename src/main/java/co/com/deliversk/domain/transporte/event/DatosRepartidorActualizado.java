package co.com.deliversk.domain.transporte.event;

import co.com.deliversk.domain.transporte.valor.Dato;
import co.com.sofka.domain.generic.DomainEvent;

public class DatosRepartidorActualizado extends DomainEvent {
    private final Dato datos;

    public DatosRepartidorActualizado(Dato datos) {
        super("transporte.datosrepartidoractualizado");
        this.datos = datos;
    }

    public Dato getDatos() {
        return datos;
    }

    
}
