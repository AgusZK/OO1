package ejercicio19_20;

import ejercicio16.DateLapse;

import java.util.ArrayList;

public class Propiedad {
    private String direccion;
    private String nombreDesc;
    private double precioNoche;
    private ArrayList<Reserva> reservas;
    private Politica politica;

    public Propiedad(String dir, String nom, double precio, Politica pol){
        this.direccion = dir;
        this.nombreDesc = nom;
        this.precioNoche = precio;
        this.reservas = new ArrayList<Reserva>();
        this.politica = pol;
    }

    public double getPrecioNoche(){
        return this.precioNoche;
    }

    public ArrayList<Reserva> getReservas(){
        return new ArrayList<>(this.reservas);
    }

    // Checkea que no haya reservas en la fecha del parametro
    public boolean disponible (DateLapse p){
        return this.reservas.stream().noneMatch(r -> r.disponible(p));
    }

    public Reserva crearReserva(DateLapse p, Usuario inquilino){
        if (this.disponible(p)){
            Reserva r = new Reserva (p, this, inquilino);
            this.reservas.add(r);
            return r;
        }
        return null;
    }

    // Cancelo reserva y devuelvo plata dependiendo de politica
    public double cancelarReserva(Reserva r){
        if (r.existeReserva()){
            this.reservas.remove(r);
            return this.politica.reembolso(r);
        }
        return 0;
    }

    public double calcularPrecio(){
        return this.reservas.stream().mapToDouble(r -> r.precio()).sum();
    }
}
