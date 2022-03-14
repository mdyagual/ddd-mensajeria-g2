package co.com.deliversk.domain.transporte.command;

import co.com.deliversk.domain.transporte.valor.Dato;

public class ActualizarDatosRepartidor {
    private final Dato datos;

    public ActualizarDatosRepartidor(Dato datos) {        
        this.datos = datos;
    }

    public Dato getDatos() {
        return datos;
    }
}
