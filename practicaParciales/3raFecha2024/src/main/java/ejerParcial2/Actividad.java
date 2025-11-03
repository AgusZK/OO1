package ejerParcial2;

import java.time.LocalDate;

public abstract class Actividad {
    private LocalDate fechaInicio;
    private String direccionIP;

    public Actividad (LocalDate fechaInicio, String direccionIP){
        this.fechaInicio = fechaInicio;
        this.direccionIP = direccionIP;
    }

    public LocalDate getFecha(){return this.fechaInicio;}
    public String getIP(){return this.direccionIP;}

    public abstract double calcularCosto();
}
