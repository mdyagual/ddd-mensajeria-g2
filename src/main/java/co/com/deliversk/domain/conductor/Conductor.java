package co.com.deliversk.domain.conductor;

import co.com.deliversk.domain.conductor.event.ConductorCreado;
import co.com.deliversk.domain.conductor.event.DatosActualizadosDelConductor;
import co.com.deliversk.domain.conductor.valor.ConductorID;
import co.com.deliversk.domain.conductor.valor.Datos;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class Conductor extends AggregateEvent<ConductorID> {
    protected Datos datos;

    public Conductor(ConductorID conductorID, Datos datos) {
        super(conductorID);
        appendChange(new ConductorCreado(datos)).apply();
        subscribe(new ConductorEventChange(this));
    }

    private Conductor(ConductorID conductorID) {
        super(conductorID);
        subscribe(new ConductorEventChange(this));
    }

    public static Conductor from(ConductorID conductorID, List<DomainEvent> events) {
        var conductor = new Conductor(conductorID);
        events.forEach(conductor::applyEvent);
        return conductor;
    }


    public void actualizarDatos(Datos datos) {
        appendChange(new DatosActualizadosDelConductor(datos)).apply();
    }


}
