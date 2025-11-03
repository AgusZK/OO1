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

    public double montoTotalACobrar(DateLapse periodo){
        double base = this.plan.calcularPrecioBase();
        double actividades = this.plan.calcularMontoActividades(periodo);
        int antiguedad = Period.between(this.fechaAlta, periodo.getTo()).getYears();
        double penalizacion = 0;
        if (antiguedad > 10){ penalizacion = this.plan.calcularPenalizacion(periodo);}
        return base + actividades + penalizacion;
    }
}
