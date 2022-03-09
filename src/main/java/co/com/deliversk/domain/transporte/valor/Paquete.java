package co.com.deliversk.domain.transporte.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Paquete implements ValueObject<Paquete.Props> {

    private final Double peso;
    private final String descripcion;

    public Paquete(Double peso, String descripcion) {
        this.peso = Objects.requireNonNull(peso);
        this.descripcion = Objects.requireNonNull(descripcion);
        if(this.peso <= 0){
            throw new IllegalArgumentException("Debes ingresar un peso valido");
        }
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String descripcion() {
                return descripcion;
            }

            @Override
            public Double peso() {
                return peso;
            }
        };
    }

    public interface Props {
        String descripcion();
        Double peso();
    }
}
