package co.com.deliversk.mensajeria.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.deliversk.mensajeria.valor.OrdenId;

public class OrdenEntregada extends DomainEvent {
    private final OrdenId ordenId;

    public OrdenEntregada(OrdenId ordenId) {
        super("transporte.entregarorden");
        this.ordenId = ordenId;
    }

    public OrdenId getOrdenId() {
        return ordenId;
    }
}
