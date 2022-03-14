package co.com.deliversk.domain.Repartidor.valor;

import co.com.sofka.domain.generic.ValueObject;

import javax.swing.*;
import java.util.Objects;

public class Datos implements ValueObject<Datos.Props> {

    private final String nombres;
    private final String apellidos;
    private  final int edad;

    public Datos(String nombres, String apellidos, int edad) {
        this.nombres = Objects.requireNonNull(nombres);
        this.apellidos = Objects.requireNonNull(apellidos);
        this.edad = Objects.requireNonNull(edad);

        if(this.nombres.isBlank() || this.apellidos.isBlank()) {
            throw  new IllegalArgumentException("Estos campos son obligatorios");
        }

        if(edad < 18) {
            throw new IllegalArgumentException("No puede ser menor de edad");
        }
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
