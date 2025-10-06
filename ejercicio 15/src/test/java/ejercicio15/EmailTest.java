package ejercicio15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmailTest {
    private Email mail1,mail2;
    private Archivo arch1,arch2;


    @BeforeEach
    void setUp(){
        mail1 = new Email("CADP", "cuerpo1");
        mail2 = new Email("","");
        arch1 = new Archivo("archivo1");
        arch2 = new Archivo("archivo2");
        mail1.agregarAdjunto(arch1);
        mail1.agregarAdjunto(arch2);
    }

    @Test
    void testTamanio(){
        assertEquals(27, mail1.tamanioEmail());
        assertEquals(0, mail2.tamanioEmail());
    }

    @Test
    void testContiene(){
        assertTrue(mail1.contiene("CADP"));
        assertTrue(mail2.contiene(""));
        assertTrue(mail1.contiene("cuerpo1"));
        assertFalse(mail1.contiene(null));
        assertFalse(mail1.contiene("asdas"));
    }
}
