package ejerParcial;

import java.time.LocalDate;

public class EventoVirtual extends Evento{

    // Precio envio remera

    public EventoVirtual(String nombre, LocalDate fecha, String tema, double pi, double pr){
        super(nombre,fecha,tema,pi,pr);
    }
    @Override
    public double precioAsistencia(LocalDate fecha) {
        double recargo = 0;
        if (fecha.equals(this.getFecha())){
            recargo += this.getPrecio() * 0.2;
        }
        return this.getPrecio() + recargo;
    }
}
