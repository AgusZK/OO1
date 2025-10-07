package ejercicio15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteDeCorreoTest {
    private ClienteDeCorreo clienteCorreo;
    private Carpeta carpeta;

    @BeforeEach
    void setUp(){
        clienteCorreo = new ClienteDeCorreo("Agus");
        carpeta = new Carpeta ("Carpeta 1");
        clienteCorreo.agregarCarpeta(carpeta);
    }

    @Test
    void testBuscar(){
        Email mail = new Email("mail1", "cuerpo1");
        clienteCorreo.recibir(mail);
        assertNotNull(clienteCorreo.buscar("mail1"));
        clienteCorreo.mover(mail,carpeta);
        assertNotNull(clienteCorreo.buscar("mail1"));
    }

    @Test
    void testEspacio(){
        Email mail1 = new Email ("mail1", "cuerpo1");
        Email mail2 = new Email ("mail2", "cuerpo2");
        clienteCorreo.recibir(mail1);
        clienteCorreo.mover(mail2,carpeta);
        assertEquals(12, clienteCorreo.espacioOcupado());
    }
}
