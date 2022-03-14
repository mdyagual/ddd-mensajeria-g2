package co.com.deliversk.domain.Repartidor.event;

import co.com.deliversk.domain.Repartidor.valor.Datos;
import co.com.sofka.domain.generic.DomainEvent;

public class DatosActualizadosDelRepartidor extends DomainEvent {
    private final Datos datos;

    public DatosActualizadosDelRepartidor(Datos datos) {
        super("deliversk.repartidor.datosActualizados");
        this.datos = datos;
    }


    public Datos getDatos() {
        return datos;
    }
}
