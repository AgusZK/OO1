package ejercicio13;

public class InversionAcciones implements Inversion{
    private String nombre;
    private int cantidad;
    private double valorUnitario;

    public InversionAcciones(String nombre, int cantidad , double valorU){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.valorUnitario = valorU;
    }

    public double valorActual(){
        return this.cantidad * this.valorUnitario;
    }
}
