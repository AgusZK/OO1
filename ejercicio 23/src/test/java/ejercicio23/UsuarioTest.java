package ejercicio23;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    private Conductor conductor;
    private Pasajero pasajero1;
    private Pasajero pasajero2;
    private Vehiculo vehiculo;
    private Viaje viaje1, viaje2;

    @BeforeEach
    public void setUp() {
        conductor = new Conductor("Tomi", 20000, "Toyota Corolla", 4, 2018, 3000000);
        vehiculo = conductor.getVehiculo();

        pasajero1 = new Pasajero("Agus", 15000);
        pasajero2 = new Pasajero("Pepe", 5000);

        viaje1 = new Viaje(20000, "La Plata", "Mar del Plata", LocalDate.of(2025, 11, 10), vehiculo);
        viaje2 = new Viaje(30000, "Mar del Plata", "Cordoba", LocalDate.of(2025, 12, 5), vehiculo);
    }

    @Test
    void testRegistrarPasajeros() {
        viaje1.registrarPasajero(pasajero1);
        viaje1.registrarPasajero(pasajero2);
        assertEquals(2, viaje1.getPasajeros().size());
        assertEquals(2, conductor.getViajes().size());
    }

    @Test
    void testListarDestinos() {
        viaje1.registrarPasajero(pasajero1);
        viaje2.registrarPasajero(pasajero1);

        assertEquals("Mar del Plata, Cordoba", pasajero1.listarDestinos());
        assertEquals("Mar del Plata, Cordoba", conductor.listarDestinos());
    }

    @Test
    void testCargarYDescontarSaldo() {
        pasajero1.cargarSaldo(5000);
        assertEquals(20000, pasajero1.getSaldo());
        pasajero1.descontarSaldo(10000);
        assertEquals(10000, pasajero1.getSaldo());
    }

    @Test
    void testCalcularDescuento() {
        assertEquals(0, pasajero1.calcularDescuento());
        pasajero1.agregarViaje(viaje1);
        assertEquals(5000, pasajero1.calcularDescuento());
        assertEquals(3000, conductor.calcularDescuento());
    }

    @Test
    void testCobrarCosto() {
        viaje1.registrarPasajero(pasajero1);
        viaje1.registrarPasajero(pasajero2);
        double saldoInicialC = conductor.getSaldo();
        double saldoInicialP1 = pasajero1.getSaldo();
        viaje1.cobrarCosto();
        assertTrue(conductor.getSaldo() < saldoInicialC);
        assertTrue(pasajero1.getSaldo() < saldoInicialP1);
    }
}
