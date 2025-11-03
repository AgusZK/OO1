package ejercicio19_20;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String direccion;
    private String DNI;
    private ArrayList<Propiedad> propiedades;

    public Usuario (String nombre, String direccion, String DNI){
        this.nombre = nombre;
        this.direccion = direccion;
        this.DNI = DNI;
        this.propiedades = new ArrayList<Propiedad>();
    }

    public void agregarPropiedad(Propiedad p){
        this.propiedades.add(p);
    }

    public double calcularIngresos(){
        return this.propiedades.stream().mapToDouble(p -> p.calcularPrecio()).sum();
    }
}
