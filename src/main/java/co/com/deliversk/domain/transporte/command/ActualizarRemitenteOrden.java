package co.com.deliversk.domain.transporte.command;

import co.com.deliversk.domain.transporte.valor.Remitente;
import co.com.sofka.domain.generic.Command;

public class ActualizarRemitenteOrden extends Command{
    private final Remitente remitente;

    public ActualizarRemitenteOrden(Remitente remitente) {
        this.remitente = remitente;
    }

    public Remitente getRemitente() {
        return remitente;
    }

    

    

}
