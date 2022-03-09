package co.com.deliversk.domain.transporte.valor;

import co.com.sofka.domain.generic.Identity;

public class ConductorId extends Identity {
    private ConductorId(String valor){
        super(valor);
    }

    public ConductorId(){}
    public static ConductorId of(String valor) {
        return new ConductorId(valor);
    }
}
