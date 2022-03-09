package co.com.deliversk.domain.transporte.event;

import co.com.sofka.domain.generic.DomainEvent;

public class RutaActualizada extends DomainEvent {
    private final String direccion;

    public RutaActualizada(String direccion){
        super("transporte.rutaactualizada");
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }
}
