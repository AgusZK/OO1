package ejercicio23;

public class Pasajero extends Usuario{

    public Pasajero(String nombre, double saldo){
        super(nombre,saldo);
    }
    public double calcularDescuento(){
        return (this.getViajes().size() >= 1) ? 5000: 0;
    }
}
