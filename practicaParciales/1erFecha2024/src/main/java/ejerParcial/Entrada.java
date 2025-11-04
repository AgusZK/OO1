package ejerParcial;
import java.time.LocalDate;
import java.time.Period;

public class Entrada {
    private LocalDate fecha;
    private boolean seguroReembolso;
    private Evento evento;

    public Entrada (Evento evento, boolean seguroReembolso){
        this.evento = evento;
        this.fecha = LocalDate.now();
        this.seguroReembolso = seguroReembolso;
    }

    public LocalDate getFecha(){return this.fecha;}

    public double precioE(){ return this.evento.precioAsistencia(this.fecha);}

    public double calcularDevolucion(){
        double devolver = 0;
        int dias = Period.between(this.fecha, evento.getFecha()).getDays();
        double precio = this.evento.precioAsistencia(this.fecha);
        if (dias >= 30){
            devolver = precio * 0.5;
        }
        if (this.seguroReembolso){
            devolver += precio * 0.15;
        }

        return devolver;
    }
}
