package ejercicio24;

import java.time.LocalDate;
import java.util.ArrayList;

public class OrdenCompra extends Orden {
    private ArrayList<Producto> productos;
    private double precioEnvio;

    public OrdenCompra(LocalDate fecha, Usuario usuario, String domicilio, double precioEnvio) {
        super(fecha, usuario, domicilio);
        this.precioEnvio = precioEnvio;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }

    @Override
    public double calcularCosto() {
        double total = productos.stream().mapToDouble(p -> p.getCosto()).sum() + precioEnvio;
        // Aplico descuento
        if (productos.size() >= 5) {
            total *= 0.9;
        }
        return total;
    }
}
