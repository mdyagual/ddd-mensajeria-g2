package co.com.deliversk.domain.transporte.command;

import co.com.deliversk.domain.transporte.valor.Paquete;
import co.com.sofka.domain.generic.Command;

public class ActualizarPaqueteOrden extends Command {
    private final Paquete paquete;

    public ActualizarPaqueteOrden(Paquete paquete) {
        this.paquete = paquete;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    

    


}
