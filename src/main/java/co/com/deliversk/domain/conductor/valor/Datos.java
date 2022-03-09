package co.com.deliversk.domain.conductor.valor;

import co.com.sofka.domain.generic.ValueObject;

public class Datos implements ValueObject<Datos.Props> {

    private final String nombres;
    private final String apellidos;
    private final int edad;

    public Datos(String nombres, String apellidos, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
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
            public int edad() {
                return edad;
            }
        };
    }

    public interface Props {
        String nombres();
        String apellidos();
        int edad();
    }
}
