package ejerParcial2;

import ejercicio16.DateLapse;

import java.util.ArrayList;

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
                .count();
    }
    public abstract double calcularPenalizacion(DateLapse periodo);


}
