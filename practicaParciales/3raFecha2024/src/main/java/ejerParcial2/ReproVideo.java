package ejerParcial2;

import java.time.LocalDate;

public class ReproVideo extends Actividad{
    private int duracionTotal;
    private int duracionPubli;

    public ReproVideo(LocalDate fecha, String direccionIP, int duracionT, int duracionP){
        super(fecha,direccionIP);
        this.duracionTotal = duracionT;
        this.duracionPubli = duracionP;
    }

    @Override
    public double calcularCosto() {
        int duracionFinal = this.duracionTotal - this.duracionPubli;
        return 10 * duracionFinal;
    }
}
