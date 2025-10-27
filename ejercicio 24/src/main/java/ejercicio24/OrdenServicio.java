package ejercicio24;

import java.time.LocalDate;
import java.util.ArrayList;

public class OrdenServicio extends Orden {
    private String descripcion;
    private int horas;
    private ArrayList<Tecnico> tecnicos;
    private ArrayList<Producto> productos;

    public OrdenServicio(LocalDate fecha, Usuario usuario, String domicilio, String descripcion, int horas) {
        super(fecha, usuario, domicilio);
        this.descripcion = descripcion;
        this.horas = horas;
        this.tecnicos = new ArrayList<>();
        this.productos = new ArrayList<>();
    }

    public void agregarTecnico(Tecnico t) {
        this.tecnicos.add(t);
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }

    @Override
    public double calcularCosto() {
        double costoProductos = productos.stream().mapToDouble(p -> p.getCosto()).sum();
        double costoTecnicos = tecnicos.stream().mapToDouble(t -> t.getValorHora() * horas).sum();
        double total = costoProductos + costoTecnicos;
        // Aplico descuento
        if (horas > 10) {
            total *= 0.9;
        }

        return total;
    }
}
