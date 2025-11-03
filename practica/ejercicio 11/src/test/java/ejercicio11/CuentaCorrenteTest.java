package ejercicio11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuentaCorrenteTest {
    private CuentaCorriente cuenta1;
    private CuentaCorriente cuenta2;

    @BeforeEach
    void setUp(){
        cuenta1 = new CuentaCorriente();
        cuenta2 = new CuentaCorriente();
    }

    @Test
    void testConstructor(){
        assertEquals(0, cuenta1.getDescubierto());
        assertEquals(0, cuenta1.getSaldo());
    }

    @Test
    void testExtraer(){
        cuenta1.setDescubierto(500);
        cuenta1.depositar(100);
        assertTrue(cuenta1.extraer(300));
        assertEquals(-200, cuenta1.getSaldo());
        assertFalse(cuenta1.extraer(1000));
    }

    @Test
    void testDespositar(){
        cuenta1.depositar(1000);
        cuenta1.extraer(500);
        assertEquals(500, cuenta1.getSaldo());
    }

    @Test
    void testTransferirACuenta(){
        cuenta1.setDescubierto(500);
        cuenta1.depositar(100);
        assertTrue(cuenta1.transferirACuenta(300,cuenta2));
        assertEquals(-200, cuenta1.getSaldo());
    }
}
