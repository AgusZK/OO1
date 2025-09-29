package ejercicio13;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class InversionPlazoFijo implements Inversion{
    private LocalDate fechaConstitucion;
    private double montoDepositado;
    private double interes;

    public InversionPlazoFijo(LocalDate fecha, double monto, double interes){
        this.fechaConstitucion = fecha;
        this.montoDepositado = monto;
        this.interes = interes;
    }

    @Override
    public double valorActual() {
        // OBTENGO DIAS ENTRE FECHACONST Y HOY, DEVUELVO MONTO + MONTO * DIAS * INTERES
        double dias = ChronoUnit.DAYS.between(fechaConstitucion, LocalDate.now());
        return this.montoDepositado + (this.montoDepositado * this.interes * dias);
    }
}
