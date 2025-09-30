package ejercicio13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

class InversorTest{
    private Inversor inversor;
    private InversionAcciones accion;
    private InversionPlazoFijo plazofijo;

    @BeforeEach
    void setUp(){
        inversor = new Inversor("Agus");
        accion = new InversionAcciones("Bitcoin",10,1000);
        plazofijo = new InversionPlazoFijo(LocalDate.of(2025, 9,20),200,0.1);
    }

    @Test
    void testInversor(){
        assertEquals(0, inversor.valorActual());
        inversor.agregarInversion(accion);
        inversor.agregarInversion(plazofijo);
        assertEquals(10400, inversor.valorActual());
    }

    @Test
    void testInversionEnAcciones(){
        assertEquals(10000, accion.valorActual());
    }

    @Test
    void testInversionPlazoFijo(){
        assertEquals(400, plazofijo.valorActual());
    }

}