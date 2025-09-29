package ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
    private String nombre;
    private ArrayList<Inversion> inversiones;

    public Inversor(String nombre){
        this.nombre = nombre;
        this.inversiones = new ArrayList<Inversion>();
    }

    public String getNombre(){
        return this.nombre;
    }

    public void agregarInversion(Inversion inv){
        this.inversiones.add(inv);
    }

    public void quitarInversion(Inversion inv){
        this.inversiones.remove(inv);
    }

    public double valorActual(){
        return this.inversiones.stream().mapToDouble(inversion -> inversion.valorActual()).sum();
    }
}
