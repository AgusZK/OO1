package ejerParcial;

import java.time.LocalDate;

public abstract class Evento {
    private String nombre;
    private LocalDate fecha;
    private String tema;
    private double precioInscripcion;
    private double precioRemera;

    public Evento(String nombre, LocalDate fecha, String tema, double pi, double pr){
        this.nombre = nombre;
        this.fecha = fecha;
        this.tema = tema;
        this.precioInscripcion = pi;
        this.precioRemera = pr;
    }
    public double getPrecio(){return this.precioInscripcion;}
    public double getPrecioRemera(){return this.precioRemera;}
    public LocalDate getFecha(){return this.fecha;}
    public abstract double precioAsistencia(LocalDate fecha);
}
