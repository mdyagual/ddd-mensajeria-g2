package co.com.deliversk.domain.transporte.command;

import co.com.deliversk.domain.transporte.valor.Destinatario;
import co.com.sofka.domain.generic.Command;

public class ActualizarDestinatarioOrden extends Command {
    private final Destinatario destinatario;

    public ActualizarDestinatarioOrden(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    

    
}
