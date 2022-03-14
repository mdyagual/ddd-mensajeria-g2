package co.com.deliversk.domain.transporte.command;

import co.com.sofka.domain.generic.Command;

public class CrearRuta extends Command{
    private final String direccion;
    private final String ciudad;

    public CrearRuta(String ciudad, String direccion) {
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
