package co.com.deliversk.mensajeria.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;

public class Fecha implements ValueObject<Date> {
    private final Date value;

    public Fecha(Date value) {
        this.value = value;//TODO: validar fechas, si se permite en el pasado, fechas en el futuro...
    }

    public Fecha() {
       this(new Date());
    }

    @Override
    public Date value() {
        return value;
    }
}
