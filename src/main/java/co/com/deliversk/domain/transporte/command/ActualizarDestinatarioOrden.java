package co.com.deliversk.domain.transporte.command;

import co.com.deliversk.domain.transporte.valor.Destinatario;
import co.com.deliversk.domain.transporte.valor.OrdenId;
import co.com.deliversk.domain.transporte.valor.TransporteId;
import co.com.sofka.domain.generic.Command;

public class ActualizarDestinatarioOrden extends Command {
    private final Destinatario destinatario;
    private final TransporteId transporteId;
    private final OrdenId ordenId;

    public ActualizarDestinatarioOrden(TransporteId transporteId, OrdenId ordenId,Destinatario destinatario) {
        this.transporteId = transporteId;
        this.ordenId = ordenId;
        this.destinatario = destinatario;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public TransporteId getTransporteId() {
        return transporteId;
    }

    public OrdenId getOrdenId() {
        return ordenId;
    }

    

    

    

    
}
