package ejercicio21;

public class PersonaFisica extends Cliente {
    private int DNI;

    public PersonaFisica(String nombre, String direccion, int DNI){
        super(nombre,direccion);
        this.DNI = DNI;
    }

    // Aplico descuento de 10%
    public double calcularMonto(double precio){
        return  precio - precio * 0.1;
    }
}
