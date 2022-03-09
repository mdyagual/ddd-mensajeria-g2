package co.com.deliversk.domain.transporte.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Remitente implements ValueObject<Remitente.Props> {

    private final String nombre;
    private final String apellido;
    private final String identidad;

    public Remitente(String nombre, String apellido, String identidad) {
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
