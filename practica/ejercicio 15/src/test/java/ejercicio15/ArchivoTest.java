package ejercicio15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArchivoTest {
    private Archivo arch, arch2;

    @BeforeEach
    void setUp(){
        arch = new Archivo("archivo1");
        arch2 = new Archivo("");
    }

    @Test
    void testTamanio(){
        assertEquals(8, arch.tamanio());
        assertEquals(0, arch2.tamanio());
    }
}
