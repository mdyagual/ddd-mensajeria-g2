package co.com.deliversk.domain.transporte.valor;

import co.com.sofka.domain.generic.Identity;

public class OrdenId extends Identity {
    private OrdenId(String valor){
        super(valor);
    }

    public OrdenId(){}
    public static OrdenId of(String valor) {
        return new OrdenId(valor);
    }
}
