package co.com.deliversk.domain.transporte;

import co.com.deliversk.domain.transporte.event.OrdenCreada;
import co.com.deliversk.domain.transporte.event.OrdenEntregada;
import co.com.deliversk.domain.transporte.event.TransporteCreado;
import co.com.deliversk.domain.transporte.event.DestinatarioOrdenActualizado;
import co.com.deliversk.domain.transporte.event.RemitenteOrdenActualizado;
import co.com.deliversk.domain.transporte.event.PaqueteOrdenActualizado;
import co.com.sofka.domain.generic.EventChange;

import java.util.ArrayList;
import java.util.HashMap;

public class TransporteEventChange extends EventChange {
    public TransporteEventChange(Transporte transporte) {

        apply((TransporteCreado event) -> {
            transporte.conductorId = event.getConductorId();
            transporte.rutas = new ArrayList<>();
            transporte.ordenes = new HashMap<>();
        });

        apply((OrdenCreada event) -> {
            transporte.ordenes.put(event.getOrdenId().value(), new Orden(event.getOrdenId(),event.getRemitente(),event.getDestinatario(),event.getPaquete()));
            
        });

        apply((OrdenEntregada event) -> {
            transporte.ordenes.get(event.getOrdenId().value()).entregarOrden();
        });

        apply((DestinatarioOrdenActualizado event) -> {
            transporte.ordenes.get(event.getOrdenId().value()).cambiarDestinatario(event.getDestinatario());
        });

        apply((RemitenteOrdenActualizado event) -> {
            transporte.ordenes.get(event.getOrdenId().value()).cambiarRemitente(event.getRemitente());
        });

        apply((PaqueteOrdenActualizado event) -> {
            transporte.ordenes.get(event.getOrdenId().value()).cambiarPaquete(event.getPaquete());
        });
        
    }
}
