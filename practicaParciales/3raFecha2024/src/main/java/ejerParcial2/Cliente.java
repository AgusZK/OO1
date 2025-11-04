package ejerParcial2;

import ejercicio16.DateLapse;
import java.time.LocalDate;
import java.time.Period;

public class Cliente {
    private String nombre;
    private LocalDate fechaAlta;
    private Plan plan;

    public Cliente(String nombre, LocalDate fecha, Plan plan){
        this.nombre = nombre;
        this.fechaAlta = fecha;
        this.plan = plan;
    }

    public double calcularBase(){
        return this.plan.calcularPrecioBase();
    }

    // desastre envidioso mal. El plan sabe calcular su monto total
    public double montoTotalACobrar(DateLapse periodo){
        int antiguedad = Period.between(this.fechaAlta, periodo.getTo()).getYears();
        return plan.calcularMontoTotal(periodo, antiguedad);
    }
}
