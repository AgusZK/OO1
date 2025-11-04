package ejerParcial2;

import ejercicio16.DateLapse;

import java.time.Period;
import java.util.ArrayList;
import java.util.stream.Collectors;

public abstract class Plan {
    private double precioBase;
    private int cantIP;
    private ArrayList<Actividad> actividades;

    public int getCantIp(){return this.cantIP;}

    public Plan (double precioBase, int cantIP){
        this.precioBase = precioBase;
        this.cantIP = cantIP;
        this.actividades = new ArrayList<Actividad>();
    }

    public abstract double calcularPrecioBase();
    public double calcularMontoActividades(DateLapse periodo){
        return this.actividades.stream()
                .filter(a -> periodo.includesDate(a.getFecha()))
                .mapToDouble(a -> a.calcularCosto())
                .sum();
    }
    public long contarIpsEnPeriodo(DateLapse periodo){
        return this.actividades.stream()
                .filter(a -> periodo.includesDate(a.getFecha()))
                .map(Actividad::getIP)
                .collect(Collectors.toSet()) // No admite repetidos, antes contaba cant actividades
                .size();
    }
    public abstract double calcularPenalizacion(DateLapse periodo);

    public double calcularMontoTotal(DateLapse periodo, int antiguedad){
        double base = this.calcularPrecioBase();
        double actividades = this.calcularMontoActividades(periodo);
        double penalizacion = 0;
        if (antiguedad > 10){ penalizacion = this.calcularPenalizacion(periodo);}
        return base + actividades + penalizacion;
    }
}
