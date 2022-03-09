package co.com.deliversk.domain.Repartidor.valor;

import co.com.deliversk.domain.transporte.valor.TransporteId;
import co.com.sofka.domain.generic.Identity;

public class RepartidorId extends Identity {

    private RepartidorId(String valor){
        super(valor);
    }

    public RepartidorId(){}

    public static RepartidorId of(String valor) {
        return new RepartidorId(valor);
    }
}
