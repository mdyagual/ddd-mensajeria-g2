package co.com.deliversk.domain.conductor;

import co.com.deliversk.domain.conductor.event.ConductorCreado;
import co.com.sofka.domain.generic.EventChange;

public class ConductorEventChange extends EventChange {

    public ConductorEventChange(Conductor conductor) {
        apply((ConductorCreado event) -> {
            conductor.datos = event.getDatos();
        } );
    }
}
