package co.com.deliversk.domain.Repartidor.valor;

import co.com.sofka.domain.generic.ValueObject;

import javax.swing.*;

public class Datos implements ValueObject<Datos.Props> {

    private final String nombres;
    private final String apellidos;
    private  final int edad;

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
                return null;
            }

            @Override
            public Spring apellidos() {
                return null;
            }

            @Override
            public int edad() {
                return 0;
            }
        };
    }

    public interface Props{
        String nombres();
        Spring apellidos();
        int edad();
    }
}
