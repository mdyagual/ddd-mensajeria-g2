package co.com.deliversk.domain.transporte.command;

import co.com.sofka.domain.generic.Command;

public class ActualizarRuta extends Command{
    private final String direccion;

    public ActualizarRuta(String direccion){
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }
    
}
