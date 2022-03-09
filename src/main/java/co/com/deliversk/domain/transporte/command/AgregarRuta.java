package co.com.deliversk.domain.transporte.command;

import co.com.sofka.domain.generic.Command;

public class AgregarRuta extends Command{
    private final String direccion;
    private final String ciudad;

    public AgregarRuta(String ciudad, String direccion) {
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
