package co.com.deliversk.mensajeria.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Destinatario  implements ValueObject<Destinatario.Props> {

    private final String nombre;
    private final String apellido;
    private final String identidad;

    public Destinatario(String nombre, String apellido, String identidad) {
        //TODO: validaciones
        this.nombre = Objects.requireNonNull(nombre);
        this.apellido = Objects.requireNonNull(apellido);
        this.identidad = Objects.requireNonNull(identidad);
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
        };
    }

    public interface Props{
        String nombre();
        String apellido();
        String identidad();
    }
}
