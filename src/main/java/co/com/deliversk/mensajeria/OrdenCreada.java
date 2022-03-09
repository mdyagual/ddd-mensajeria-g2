package co.com.deliversk.mensajeria;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.deliversk.mensajeria.valor.Destinatario;
import co.com.deliversk.mensajeria.valor.OrdenId;
import co.com.deliversk.mensajeria.valor.Remitente;

public class OrdenCreada extends DomainEvent {
    private final OrdenId ordenId;
    private final Remitente remitente;
    private final Destinatario destinatario;

    public OrdenCreada(OrdenId ordenId, Remitente remitente, Destinatario destinatario) {
        super("transporte.ordencreada");
        this.ordenId = ordenId;
        this.remitente = remitente;
        this.destinatario = destinatario;
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
}
