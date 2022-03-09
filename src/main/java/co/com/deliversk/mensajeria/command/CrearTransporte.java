package co.com.deliversk.mensajeria.command;

import co.com.sofka.domain.generic.Command;
import co.com.deliversk.mensajeria.valor.ConductorId;
import co.com.deliversk.mensajeria.valor.TransporteId;

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
