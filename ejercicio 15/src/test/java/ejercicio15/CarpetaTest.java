package ejercicio15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarpetaTest {
    private Carpeta carpeta, carpeta2;
    private Email mail1, mail2;


    @BeforeEach
    void setUp(){
        carpeta = new Carpeta ("Archivos");
        carpeta2 = new Carpeta ("Fotos");
        mail1 = new Email ("pepe12", "hola");
        mail2 = new Email ("pedro23", "chau");
        carpeta.agregarMail(mail1);
        carpeta.agregarMail(mail2);
    }

    @Test
    void testTamanio(){
        assertEquals(21, carpeta.tamanioCarpeta());
    }

    @Test
    void testBuscar(){
        assertNotNull(carpeta.buscar("pepe12"));
        assertNull(carpeta.buscar(null));
        assertNull(carpeta.buscar("asdasdasd"));
    }

    @Test
    void testMover(){
        carpeta.mover(mail1, carpeta2);
        assertNotNull(carpeta2.buscar("pepe12"));
        assertNull(carpeta.buscar("pepe12"));
    }
}
