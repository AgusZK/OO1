package ejerParcial;

import ejercicio16.DateLapse;

import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private ArrayList<Entrada> entradas;

    public Usuario(String nombre){
        this.nombre = nombre;
        this.entradas = new ArrayList<Entrada>();
    }

    public double consultarPrecio(Evento e){
        return e.precioAsistencia(LocalDate.now());
    }

    public Entrada comprarEntrada(Evento e, boolean seguro){
        Entrada ent = new Entrada(e,seguro);
        this.entradas.add(ent);
        return ent;
    }

    public double montoEntrada(DateLapse periodo){
        return this.entradas.stream()
                .filter(e -> periodo.includesDate(e.getFecha()))
                .mapToDouble(e -> e.precioE())
                .sum();
    }

    public Entrada siguienteEvento() {
        LocalDate hoy = LocalDate.now();
        return this.entradas.stream()
                .filter(e -> e.getFecha().isAfter(hoy))
                .sorted((e1, e2) -> e1.getFecha().compareTo(e2.getFecha()))
                .findFirst()
                .orElse(null);
    }
}
