package ejercicio19_20;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ejercicio16.DateLapse;

class PropiedadTest {
    Usuario cliente;
    Propiedad prop1;

    @BeforeEach
    void setUp(){
        cliente = new Usuario("Pepe", "511", "111");
        prop1 = new Propiedad("1 48", "Propiedad", 1000, new PoliticaFlexible());
    }

    @Test
    void testCrearReserva(){
        DateLapse fecha1 = new DateLapse(LocalDate.of(2025,10,1), LocalDate.of(2025,12,31));
        DateLapse fecha2 = new DateLapse(LocalDate.of(2025,6,10), LocalDate.of(2025,6,17));
        DateLapse periodoOverlapse = new DateLapse(LocalDate.of(2025,10,5), LocalDate.of(2025,10, 15));

        assertTrue(prop1.crearReserva(fecha1,cliente) != null);
        assertFalse(prop1.crearReserva(periodoOverlapse,cliente) != null);
        assertTrue(prop1.crearReserva(fecha2,cliente) != null);
        assertFalse(prop1.disponible(fecha2));
    }

    @Test
    void testCancelarReserva(){
        DateLapse fecha1 = new DateLapse(LocalDate.of(2025,10,1), LocalDate.of(2025,12,31));
        Reserva r = prop1.crearReserva(fecha1,cliente);
        assertEquals(1,prop1.getReservas().size());
        assertFalse(prop1.disponible(fecha1));
        // Monto de reembolso es mayor a nada
        assertTrue(prop1.cancelarReserva(r) > 0);
        assertEquals(0, prop1.getReservas().size());
    }
}
