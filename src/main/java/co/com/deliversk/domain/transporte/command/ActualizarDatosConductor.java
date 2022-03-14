package co.com.deliversk.domain.transporte.command;

import co.com.deliversk.domain.transporte.valor.Dato;
import co.com.sofka.domain.generic.Command;

public class ActualizarDatosConductor extends Command{
    private final Dato datos;

    public ActualizarDatosConductor(Dato datos) {
        
        this.datos = datos;
    }

    public Dato getDatos() {
        return datos;
    }
}
