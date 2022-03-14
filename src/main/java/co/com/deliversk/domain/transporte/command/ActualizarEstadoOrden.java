package co.com.deliversk.domain.transporte.command;

import co.com.deliversk.domain.transporte.valor.Estado;
import co.com.sofka.domain.generic.Command;

public class ActualizarEstadoOrden extends Command {
    private final Estado estado;

    public ActualizarEstadoOrden(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    
}
