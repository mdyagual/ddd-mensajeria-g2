package co.com.deliversk.domain.transporte.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Destinatario  implements ValueObject<Destinatario.Props> {

    private final String nombre;
    private final String apellido;
    private final String identidad;
    private final String direccion;

    public Destinatario(String nombre, String apellido, String identidad, String direccion) {
        //TODO: validaciones
        this.nombre = Objects.requireNonNull(nombre);
        this.apellido = Objects.requireNonNull(apellido);
        this.identidad = Objects.requireNonNull(identidad);
        this.direccion = Objects.requireNonNull(direccion);
    }

    @Override
    public Props value() {
        return new Props() {

            @Override
            public String nombre() {
                return nombre;
            }

            @Override
            public String apellido() {
                return apellido;
            }

            @Override
            public String identidad() {
                return identidad;
            }

            @Override
            public String direccion() {
                return direccion;
            }
        };
    }

    public interface Props{
        String nombre();
        String apellido();
        String identidad();
        String direccion();
    }
}
