package co.com.deliversk.domain.conductor;

import co.com.deliversk.domain.conductor.event.ConductorCreado;
import co.com.deliversk.domain.conductor.valor.ConductorID;
import co.com.deliversk.domain.conductor.valor.Datos;
import co.com.sofka.domain.generic.AggregateEvent;

public class Conductor extends AggregateEvent<ConductorID> {
    protected Datos datos;

    public Conductor(ConductorID conductorID,Datos datos) {
        super(conductorID);
        appendChange(new ConductorCreado(datos)).apply();
        subscribe(new ConductorEventChange(this));
    }

    private Conductor(ConductorID conductorID) {
        super(conductorID);
    }
}
