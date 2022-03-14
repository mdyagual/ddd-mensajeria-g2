package co.com.deliversk.domain.transporte.event;

import co.com.sofka.domain.generic.DomainEvent;

public class RutaCreada extends DomainEvent{
    private final String direccion;
    private final String ciudad;

    public RutaCreada(String ciudad, String direccion) {
        super("transporte.rutacreada");
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    

    

    
    
}
