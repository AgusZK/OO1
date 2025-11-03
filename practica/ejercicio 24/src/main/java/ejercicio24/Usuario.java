package ejercicio24;

import java.util.ArrayList;

public class Usuario {
    private String nombreCompleto;
    private String domicilio;
    private ArrayList<Orden> ordenes;

    public Usuario(String nombreCompleto, String domicilio) {
        this.nombreCompleto = nombreCompleto;
        this.domicilio = domicilio;
        this.ordenes = new ArrayList<>();
    }

    public void agregarOrden(Orden orden) {
        this.ordenes.add(orden);
    }

    public ArrayList<Orden> getOrdenes() {
        return new ArrayList<Orden>(this.ordenes);
    }
}
