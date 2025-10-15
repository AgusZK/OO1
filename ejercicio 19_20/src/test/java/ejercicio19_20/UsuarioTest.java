package ejercicio19_20;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ejercicio16.DateLapse;

class UsuarioTest {
    Usuario usu;
    Propiedad prop1,prop2;


    @BeforeEach
    void setUp(){
        usu = new Usuario("Agustin", "511", "111");
        prop1 = new Propiedad("48", "Propiedad 1", 500, new PoliticaFlexible());
        prop2 = new Propiedad("50", "Propiedad 2", 1000, new PoliticaModerada());
    }

    @Test
    void testCalcularIngresos(){
        usu.agregarPropiedad(prop1);
        usu.agregarPropiedad(prop2);
        Usuario usu3 = new Usuario("Cliente1", "pepe", "333");
        Usuario usu4 = new Usuario("Cliente2", "pepe2", "444");
        DateLapse fecha1 = new DateLapse(LocalDate.of(2025, 10,1), LocalDate.of(2025,10,15));
        DateLapse fecha2 = new DateLapse(LocalDate.of(2025, 11,1), LocalDate.of(2025,11,15));
        prop1.crearReserva(fecha1,usu3);
        prop2.crearReserva(fecha2,usu4);
        assertEquals(21000, usu.calcularIngresos());
    }
}
