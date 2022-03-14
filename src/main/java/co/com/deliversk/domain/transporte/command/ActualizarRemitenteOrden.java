package co.com.deliversk.domain.transporte.command;

import co.com.deliversk.domain.transporte.valor.OrdenId;
import co.com.deliversk.domain.transporte.valor.Remitente;
import co.com.deliversk.domain.transporte.valor.TransporteId;
import co.com.sofka.domain.generic.Command;

public class ActualizarRemitenteOrden extends Command{
    private final Remitente remitente;
    private final TransporteId transporteId;
    private final OrdenId ordenId;


    public ActualizarRemitenteOrden(TransporteId transporteId, OrdenId ordenId,Remitente remitente) {
        this.transporteId = transporteId;
        this.ordenId = ordenId;
        this.remitente = remitente;
        
    }

    public Remitente getRemitente() {
        return remitente;
    }

    public TransporteId getTransporteId() {
        return transporteId;
    }

    public OrdenId getOrdenId() {
        return ordenId;
    }
    

    

}
