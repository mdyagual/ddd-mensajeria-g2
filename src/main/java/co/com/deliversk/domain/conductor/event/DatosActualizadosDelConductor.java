package co.com.deliversk.domain.conductor.event;


import co.com.deliversk.domain.conductor.valor.Datos;
import co.com.sofka.domain.generic.DomainEvent;

public class DatosActualizadosDelConductor extends DomainEvent {
    private final Datos datos;

    public DatosActualizadosDelConductor(Datos datos) {
        super("deliversk.conductor.datosActualizados");
        this.datos = datos;
    }


    public Datos getDatos() {
        return datos;
    }
}
