package ejercicio16;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;


class DateLapseTest {
    Date fecha1, fecha2;
    LocalDate desde = LocalDate.of(2025,10,1);
    LocalDate hasta = LocalDate.of(2025,10,31);

    LocalDate desde2 = LocalDate.of(2025,9,1);
    LocalDate hasta2 = LocalDate.of(2025,9,10);


    @BeforeEach
    void setUp(){
        fecha1 = new DateLapse(desde,hasta);
        fecha2 = new DateLapse17(desde2,10);
    }

    @Test
    void testCantDias(){
        assertEquals(30, fecha1.sizeInDays());
        assertEquals(10, fecha2.sizeInDays());
    }

    @Test
    void testContiene(){
        assertTrue(fecha1.includesDate(desde));
        assertTrue(fecha1.includesDate(hasta));
        assertTrue(fecha2.includesDate(hasta2));
    }
}
