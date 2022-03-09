package co.com.deliversk.domain.transporte.event;

import co.com.deliversk.domain.transporte.valor.ConductorId;
import co.com.sofka.domain.generic.DomainEvent;

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
