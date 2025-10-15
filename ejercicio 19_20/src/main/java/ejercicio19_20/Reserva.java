package ejercicio19_20;
import java.time.LocalDate;
import ejercicio16.DateLapse;

public class Reserva {
    private DateLapse periodo;
    private Propiedad propiedad;
    private Usuario inquilino;


    public Reserva (DateLapse periodo, Propiedad propiedad, Usuario inquilino){
        super();
        this.periodo = periodo;
        this.propiedad = propiedad;
        this.inquilino = inquilino;
    }

    public int cantDias(){
        return this.periodo.sizeInDays();
    }

    public boolean disponible(DateLapse p){
        return this.periodo.overlapse(p);
    }

    public double precio(){
        return this.periodo.sizeInDays() * this.propiedad.getPrecioNoche();
    }

    public boolean existeReserva(){
        LocalDate hoy = LocalDate.now();
        return !this.periodo.getFrom().isAfter(hoy) && !this.periodo.getTo().isBefore(hoy);
    }
}
