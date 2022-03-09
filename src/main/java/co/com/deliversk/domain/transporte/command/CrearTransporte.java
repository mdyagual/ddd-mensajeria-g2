package co.com.deliversk.domain.transporte.command;

import co.com.deliversk.domain.transporte.valor.ConductorId;
import co.com.deliversk.domain.transporte.valor.TransporteId;
import co.com.sofka.domain.generic.Command;

public class CrearTransporte extends Command {
    private final TransporteId transporteId;
    private final ConductorId conductorId;

    public CrearTransporte(TransporteId transporteId, ConductorId conductorId) {
        this.transporteId = transporteId;
        this.conductorId = conductorId;
    }

    public ConductorId getConductorId() {
        return conductorId;
    }

    public TransporteId getTransporteId() {
        return transporteId;
    }
}
