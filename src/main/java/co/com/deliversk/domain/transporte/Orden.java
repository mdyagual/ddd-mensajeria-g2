package co.com.deliversk.domain.transporte;

import co.com.deliversk.domain.transporte.valor.*;
import co.com.sofka.domain.generic.Entity;

public class Orden extends Entity<OrdenId> {
    private Remitente remitente;
    private Destinatario destinatario;
    private Estado estado;
    private Fecha fecha;

    public Orden(OrdenId ordenId, Remitente remitente, Destinatario destinatario) {
        super(ordenId);
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.fecha = new Fecha();
        this.estado = new Estado(Estado.Fase.NO_ENTREGADO);
    }

    public void entregarOrden(){
        this.estado = new Estado(Estado.Fase.ENTREGADO);
    }

    public void cambiarDestinatario(Destinatario destinatario){
        //Regla de dominio
        if(this.estado.value().equals(Estado.Fase.NO_ENTREGADO)){
            this.destinatario = destinatario;
        } else {
            throw new IllegalArgumentException("No se puede cambiar el destinatario");
        }
    }

    public Remitente remitente() {
        return remitente;
    }

    public Destinatario destinatario() {
        return destinatario;
    }

    public Estado estado() {
        return estado;
    }

    public Fecha fecha() {
        return fecha;
    }
}
