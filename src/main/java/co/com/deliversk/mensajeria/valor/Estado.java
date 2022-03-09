package co.com.deliversk.mensajeria.valor;

import co.com.sofka.domain.generic.ValueObject;

public class Estado implements ValueObject<Estado.Fase> {
    private final Fase value;

    public Estado(Fase value) {
        this.value = value;
    }

    @Override
    public Fase value() {
        return value;
    }

    public enum Fase {
        ENTREGADO, NO_ENTREGADO
    }
}
