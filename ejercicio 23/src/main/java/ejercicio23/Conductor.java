package ejercicio23;

public class Conductor extends Usuario {
    private Vehiculo vehiculo;

    public Conductor(String nombre, double saldo, String descripcionVehiculo, int capacidad, int anio, double valor) {
        super(nombre, saldo);
        this.vehiculo = new Vehiculo(this, descripcionVehiculo, capacidad, anio, valor);
    }

    public Conductor(String nombre, double saldo, Vehiculo vehiculo) {
        super(nombre, saldo);
        this.vehiculo = vehiculo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    @Override
    public double calcularDescuento() {
        return this.vehiculo.getValor() * 0.001;
    }
}
