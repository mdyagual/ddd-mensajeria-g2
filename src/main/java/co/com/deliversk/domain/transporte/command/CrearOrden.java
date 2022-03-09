package co.com.deliversk.domain.transporte.command;

import co.com.deliversk.domain.transporte.valor.Destinatario;
import co.com.deliversk.domain.transporte.valor.OrdenId;
import co.com.deliversk.domain.transporte.valor.Remitente;
import co.com.deliversk.domain.transporte.valor.TransporteId;
import co.com.sofka.domain.generic.Command;

public class CrearOrden extends Command {
    private final TransporteId transporteId;
    private final OrdenId ordenId;
    private final Remitente remitente;
    private final Destinatario destinatario;

    public CrearOrden(TransporteId transporteId, OrdenId ordenId, Remitente remitente, Destinatario destinatario) {
        this.transporteId = transporteId;
        this.ordenId = ordenId;
        this.remitente = remitente;
        this.destinatario = destinatario;
    }

    public OrdenId getOrdenId() {
        return ordenId;
    }

    public Remitente getRemitente() {
        return remitente;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public TransporteId getTransporteId() {
        return transporteId;
    }
}
