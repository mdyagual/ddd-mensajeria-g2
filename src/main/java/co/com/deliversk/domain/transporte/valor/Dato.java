package co.com.deliversk.domain.transporte.valor;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;


public class Dato implements ValueObject<Dato.Props> {
    private final String nombres;
    private final String apellidos;
    private final Integer edad;

    public Dato(String nombres, String apellidos, Integer edad) {
        this.nombres = Objects.requireNonNull(nombres);
        this.apellidos = Objects.requireNonNull(apellidos);
        this.edad = Objects.requireNonNull(edad);
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String nombres() {
                return nombres;
            }

            @Override
            public String apellidos() {
                return apellidos;
            }


            @Override
            public Integer edad() {
                return edad;
            }
        };
    }

    public interface Props {
        String nombres();
        String apellidos();
        Integer edad();
    }

    
}