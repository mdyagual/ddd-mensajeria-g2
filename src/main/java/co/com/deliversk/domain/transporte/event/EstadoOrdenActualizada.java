package co.com.deliversk.domain.transporte.event;

import co.com.deliversk.domain.transporte.valor.Estado;
import co.com.sofka.domain.generic.DomainEvent;

public class EstadoOrdenActualizada extends DomainEvent {
   
    private final Estado estado;
    

    public EstadoOrdenActualizada(Estado estado) {
        super("transporte.estadoordenactualizada");
       
        this.estado = estado;
        
    }

    

    public Estado getEstado() {
        return estado;
    }

    

    

    


}
