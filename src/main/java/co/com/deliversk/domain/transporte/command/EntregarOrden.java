package co.com.deliversk.domain.transporte.command;

import co.com.deliversk.domain.transporte.valor.OrdenId;
import co.com.deliversk.domain.transporte.valor.TransporteId;
import co.com.sofka.domain.generic.Command;

public class EntregarOrden extends Command {
    private final OrdenId ordenId;
    private final TransporteId transporteId;

    public EntregarOrden(OrdenId ordenId, TransporteId transporteId) {
        this.ordenId = ordenId;
        this.transporteId = transporteId;
    }

    public TransporteId getTransporteId() {
        return transporteId;
    }

    public OrdenId getOrdenId() {
        return ordenId;
    }
}
