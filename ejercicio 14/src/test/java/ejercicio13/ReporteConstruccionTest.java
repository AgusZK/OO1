package ejercicio14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReporteConstruccionTest {
    private ReporteDeConstruccion reporte;
    private Cilindro cilindro;
    private Esfera esfera;
    private PrismaRectangular prisma;

    @BeforeEach
    void setUp(){
        reporte = new ReporteDeConstruccion();
        cilindro = new Cilindro("Hierro", "Rojo", 20, 30);
        esfera = new Esfera("Piedra", "Verde", 10);
        prisma = new PrismaRectangular("Piedra", "Verde",20,10,40);
        reporte.agregarPieza(cilindro);
        reporte.agregarPieza(esfera);
        reporte.agregarPieza(prisma);
    }

    @Test
    void testVolumen(){
        assertEquals(37699, Math.round(cilindro.volumen()));
        assertEquals(4189, Math.round(esfera.volumen()));
        assertEquals(8000, prisma.volumen());
    }

    @Test
    void testSuperficie(){
        assertEquals(6283, Math.round(cilindro.superficie()));
        assertEquals(1257, Math.round(esfera.superficie()));
        assertEquals(2800, prisma.superficie());
    }

    @Test
    void testVolumenDeMaterial(){
        assertEquals(12189, Math.round(reporte.volumenDeMaterial("Piedra")));
        assertEquals(0, reporte.volumenDeMaterial(null));
    }

    @Test
    void testSuperficieDeColor(){
        assertEquals(4057, Math.round(reporte.superficieDeColor("Verde")));
        assertEquals(0, reporte.superficieDeColor(null));
    }
}
