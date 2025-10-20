package ejercicio21;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ejercicio16.DateLapse;

class EnvioTest {
    private PersonaFisica persona;
    private Empresa emp;
    private Envio envioL, envioUrb, envioInt;

    @BeforeEach
    public void setUp(){
        persona = new PersonaFisica("Agus", "511", 1111);
        emp = new Empresa("Fibertel", "50", 2222);
        envioL = new EnvioLocal(LocalDate.of(2025, 10,1), "La Plata", "Cordoba", 100.00, true);
        envioUrb = new EnvioInterurbano(LocalDate.of(2025, 11, 5), "Mexico", "USA", 200.00, 100);
        envioInt = new EnvioInternacional(LocalDate.of(2025, 12, 10), "Argentina", "Francia", 300, false);
    }

    @Test
    void testAgregarEnvio(){
        persona.agregarEnvio(envioL);
        persona.agregarEnvio(envioUrb);
        persona.agregarEnvio(envioInt);
        assertEquals(3, persona.getEnvios().size());
    }

    @Test
    void testMontoAPagar(){
        persona.agregarEnvio(envioL);
        persona.agregarEnvio(envioUrb);
        persona.agregarEnvio(envioInt);
        emp.agregarEnvio(envioL);
        emp.agregarEnvio(envioUrb);
        emp.agregarEnvio(envioInt);
        // Solo el primer mes
        DateLapse periodo1 = new DateLapse(LocalDate.of(2025,10,1), LocalDate.of(2025,10,30));
        // Solo el segundo mes
        DateLapse periodo2 = new DateLapse(LocalDate.of(2025,11,1), LocalDate.of(2025,11,30));
        // Solo el tercer mes
        DateLapse periodo3 = new DateLapse(LocalDate.of(2025,12,1), LocalDate.of(2025,12,31));
        // 2 meses
        DateLapse periodo4 = new DateLapse(LocalDate.of(2025,10,1), LocalDate.of(2025,11,30));
        // Todos los meses
        DateLapse periodo5 = new DateLapse(LocalDate.of(2025,10,1), LocalDate.of(2025,12,31));
        // Fuera del rango
        DateLapse periodoMalo = new DateLapse(LocalDate.of(2025,1,1), LocalDate.of(2025,5,31));

        // Persona (Con Descuento) mes1, mes2, mes3, 2 meses, Todos
        assertEquals(1350, persona.montoAPagarEnvios(periodo1));
        assertEquals(4500, persona.montoAPagarEnvios(periodo2));
        assertEquals(7200, persona.montoAPagarEnvios(periodo3));
        assertEquals(5850, persona.montoAPagarEnvios(periodo4));
        assertEquals(13050, persona.montoAPagarEnvios(periodo5));
        // Empresa mes1, Todos
        assertEquals(1500, emp.montoAPagarEnvios(periodo1));
        assertEquals(14500, emp.montoAPagarEnvios(periodo5));
        // Fuera del rango en ambos
        assertEquals(0, persona.montoAPagarEnvios(periodoMalo));
        assertEquals(0, emp.montoAPagarEnvios(periodoMalo));
    }
}
