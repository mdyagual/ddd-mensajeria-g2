package co.com.deliversk.mensajeria.valor;

import co.com.sofka.domain.generic.ValueObject;

public class Ruta implements ValueObject<Ruta.Props> {

    private final String ciudad;
    private final String direccion;

    public Ruta(String ciudad, String direccion) {
        //TODO: agregar las validaciones
        this.ciudad = ciudad;
        this.direccion = direccion;
    }


    @Override
    public Props value() {
        return new Props() {
            @Override
            public String direccion() {
                return direccion;
            }

            @Override
            public String ciudad() {
                return ciudad;
            }
        };
    }

    public interface Props{
        String direccion();
        String ciudad();
    }
}
