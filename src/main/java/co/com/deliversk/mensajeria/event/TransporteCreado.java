package co.com.deliversk.mensajeria.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.deliversk.mensajeria.valor.ConductorId;

public class TransporteCreado extends DomainEvent {
    private final ConductorId conductorId;

    public TransporteCreado(ConductorId conductorId) {
        super("transporte.transportecreado");
        this.conductorId = conductorId;
    }

    public ConductorId getConductorId() {
        return conductorId;
    }
}
