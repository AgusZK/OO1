package ejercicio24;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class GreenHomeTest {
    @Test
    void testJuan() {
        Usuario juan = new Usuario("Juan Martínez", "Larrea 5800, Mar del Plata");

        Producto panelSolar = new Producto("Panel solar", "reciclable", 35000, false);
        Producto compostera = new Producto("Compostera", "biodegradable", 8000, true);
        Producto calefonSolar = new Producto("Calefon solar", "reciclable", 50000, false);

        OrdenCompra compra = new OrdenCompra(LocalDate.now(), juan, juan.getOrdenes().toString(), 0);
        compra.agregarProducto(panelSolar);
        compra.agregarProducto(compostera);

        Tecnico lucia = new Tecnico("Lucía Iraola", "instalaciones solares", 4500);
        OrdenServicio servicio = new OrdenServicio(LocalDate.now(), juan, juan.getOrdenes().toString(),"Instalación de calefón solar", 5);
        servicio.agregarTecnico(lucia);
        servicio.agregarProducto(calefonSolar);

        juan.agregarOrden(compra);
        juan.agregarOrden(servicio);

        assertEquals(43000, compra.calcularCosto());
        assertEquals(72500, servicio.calcularCosto());
    }

    @Test
    void testDescuento() {
        Usuario agus = new Usuario("Agus", "Diag. 74 1234");

        OrdenCompra compraGrande = new OrdenCompra(LocalDate.now(), agus, agus.toString(), 0);
        // Agrego 5 compras para llegar al descuento
        for (int i = 0; i < 5; i++) {
            compraGrande.agregarProducto(new Producto("Producto " + i, "eco", 1000, true));
        }
        assertEquals(4500, compraGrande.calcularCosto());

        // Pongo mas horas para llegar al descuento
        Tecnico t1 = new Tecnico("Pedro", "electricista", 1000);
        OrdenServicio serv = new OrdenServicio(LocalDate.now(), agus, agus.toString(), "Servicio largo", 11);
        serv.agregarTecnico(t1);
        serv.agregarProducto(new Producto("Producto X", "biodegradable", 1000, true));
        assertEquals(10800, serv.calcularCosto());
    }
}
