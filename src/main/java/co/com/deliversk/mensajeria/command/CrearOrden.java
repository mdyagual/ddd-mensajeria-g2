package co.com.deliversk.mensajeria.command;

import co.com.sofka.domain.generic.Command;
import co.com.deliversk.mensajeria.valor.Destinatario;
import co.com.deliversk.mensajeria.valor.OrdenId;
import co.com.deliversk.mensajeria.valor.Remitente;
import co.com.deliversk.mensajeria.valor.TransporteId;

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
