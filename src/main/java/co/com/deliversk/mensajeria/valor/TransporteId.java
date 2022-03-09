package co.com.deliversk.mensajeria.valor;

import co.com.sofka.domain.generic.Identity;

public class TransporteId extends Identity {

    private TransporteId(String valor){
        super(valor);
    }

    public TransporteId(){}
    public static TransporteId of(String valor) {
        return new TransporteId(valor);
    }
}
