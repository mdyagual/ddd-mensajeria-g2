package co.com.deliversk.domain.transporte.event;

import co.com.sofka.domain.generic.DomainEvent;

public class RutaAgregada extends DomainEvent{
    private final String direccion;
    private final String ciudad;

    public RutaAgregada(String ciudad, String direccion) {
        super("transporte.rutaagregada");
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
