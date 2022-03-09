package co.com.deliversk.domain.transporte;

import co.com.deliversk.domain.transporte.valor.Destinatario;
import co.com.deliversk.domain.transporte.valor.OrdenId;
import co.com.deliversk.domain.transporte.valor.Paquete;
import co.com.deliversk.domain.transporte.valor.Remitente;
import co.com.sofka.domain.generic.DomainEvent;

public class OrdenCreada extends DomainEvent {
    private final OrdenId ordenId;
    private final Remitente remitente;
    private final Destinatario destinatario;
    private final Paquete paquete;

    public OrdenCreada(OrdenId ordenId, Remitente remitente, Destinatario destinatario ,Paquete paquete) {
        super("transporte.ordencreada");
        this.ordenId = ordenId;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.paquete = paquete;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public OrdenId getOrdenId() {
        return ordenId;
    }

    public Remitente getRemitente() {
        return remitente;
    }

    public Paquete getPaquete(){
        return paquete;
    }
}
