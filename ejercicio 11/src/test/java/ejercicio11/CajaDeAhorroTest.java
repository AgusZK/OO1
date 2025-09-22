package ejercicio11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CajaDeAhorroTest {
    private CajaDeAhorro caja1;
    private CajaDeAhorro caja2;

    @BeforeEach
    void setUp() throws Exception{
        this.caja1 = new CajaDeAhorro();
        this.caja2 = new CajaDeAhorro();
    }

    @Test
    void testConstructor(){
        assertEquals(0, caja1.getSaldo());
    }

    @Test
    void testDepositar(){
        this.caja1.depositar(1000);
        assertEquals(980, caja1.getSaldo());
    }

    @Test
    void testExtraer(){
        this.caja1.depositar(1000); // DEPOSITA 1000 PERO 2% COSTO ADICIONAL = 980
        this.caja1.extraer(500); // SACA 500 + 2% COSTO = 510
        assertEquals(470, caja1.getSaldo());
    }

    @Test
    void testTransferirACuenta(){
        this.caja1.depositar(1000); // 980
        this.caja1.transferirACuenta(500, caja2); // 510 saca, 490 llegan
        assertEquals(470, caja1.getSaldo());
        assertEquals(490, caja2.getSaldo());
    }
}
