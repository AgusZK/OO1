package ejercicio21;
import java.time.LocalDate;

public abstract class Envio {
    private LocalDate fechaDespacho;
    private String origen;
    private String destino;
    private double peso;

    public Envio (LocalDate fecha, String o, String d, double peso){
        this.fechaDespacho = fecha;
        this.origen = o;
        this.destino = d;
        this.peso = peso;
    }

    public LocalDate getFechaDespacho() {
        return fechaDespacho;
    }

    public double getPeso() {
        return peso;
    }

    public abstract double getMonto();
}
