package ejerParcial;

import java.time.LocalDate;
import java.util.ArrayList;

public class EventoPresencial extends Evento{
    private ArrayList<Sede> sedes;

    public EventoPresencial(String nombre, LocalDate fecha, String tema, double pi, double pr){
        super(nombre,fecha,tema,pi,pr);
        this.sedes = new ArrayList<Sede>();
    }

    @Override
    public double precioAsistencia(LocalDate fecha) {
        double recargo = 0;
        if (fecha.equals(this.getFecha())){
            recargo += this.getPrecio() * 0.2;
        }
        return this.getPrecio() + this.getPrecioRemera() +
                this.sedes.stream()
                .mapToDouble(s -> s.precioTotal())
                .sum() + recargo;
    }

    public void agregarSede(Sede s){
        this.sedes.add(s);
    }
}
