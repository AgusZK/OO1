package ejercicio24;

import java.time.LocalDate;

public abstract class Orden {
    protected LocalDate fecha;
    protected Usuario usuario;
    protected String domicilio;

    public Orden(LocalDate fecha, Usuario usuario, String domicilio) {
        this.fecha = fecha;
        this.usuario = usuario;
        this.domicilio = domicilio;
    }

    public abstract double calcularCosto();
}
