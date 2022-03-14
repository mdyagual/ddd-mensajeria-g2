package co.com.deliversk.domain.transporte.command;

import co.com.deliversk.domain.transporte.valor.OrdenId;
import co.com.deliversk.domain.transporte.valor.Paquete;
import co.com.deliversk.domain.transporte.valor.TransporteId;
import co.com.sofka.domain.generic.Command;

public class ActualizarPaqueteOrden extends Command {
    private final Paquete paquete;
    private final TransporteId transporteId;
    private final OrdenId ordenId;


    public ActualizarPaqueteOrden(TransporteId transporteId, OrdenId ordenId,Paquete paquete) {
        this.transporteId = transporteId;
        this.ordenId = ordenId;
        this.paquete = paquete;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public TransporteId getTransporteId() {
        return transporteId;
    }

    public OrdenId getOrdenId() {
        return ordenId;
    }
    

    


}
