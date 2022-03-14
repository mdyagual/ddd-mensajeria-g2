package co.com.deliversk.domain.Repartidor;

import co.com.deliversk.domain.Repartidor.event.DatosActualizadosDelRepartidor;
import co.com.deliversk.domain.Repartidor.event.RepartidorCreado;
import co.com.sofka.domain.generic.EventChange;

public class RepartidorEventChange extends EventChange {

    public RepartidorEventChange(Repartidor repartidor){
        apply((RepartidorCreado event) -> {
            repartidor.datos = event.getDatos();
        });

        apply((DatosActualizadosDelRepartidor event) -> {
            repartidor.datos = event.getDatos();
        });
    }
}
