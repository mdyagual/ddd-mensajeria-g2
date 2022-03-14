package co.com.deliversk.domain.conductor.comando;

import co.com.deliversk.domain.conductor.valor.ConductorID;
import co.com.deliversk.domain.conductor.valor.Datos;
import co.com.sofka.domain.generic.Command;


public class ActualizarDatosDelConductor extends Command {
    private final ConductorID conductorID;
    private final Datos datos;

    public ActualizarDatosDelConductor(ConductorID conductorID, Datos datos) {
        this.conductorID = conductorID;
        this.datos = datos;
    }

    public ConductorID getConductorID() {
        return conductorID;
    }

    public Datos getDatos() {
        return datos;
    }
}
