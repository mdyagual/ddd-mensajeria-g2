package co.com.deliversk.domain.transporte.event;

import co.com.deliversk.domain.transporte.valor.OrdenId;
import co.com.sofka.domain.generic.DomainEvent;

public class OrdenEntregada extends DomainEvent {
    private final OrdenId ordenId;

    public OrdenEntregada(OrdenId ordenId) {
        super("transporte.ordenentregada");
        this.ordenId = ordenId;
    }

    public OrdenId getOrdenId() {
        return ordenId;
    }
}
