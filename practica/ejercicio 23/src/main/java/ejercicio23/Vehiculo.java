package ejercicio23;

public class Vehiculo {
    private Conductor conductor;
    private String descripcion;
    private int capacidad;
    private int anioFabricacion;
    private double valor;

    public Vehiculo (Conductor c, String d, int cantidad, int anio, double valor){
        this.conductor = c;
        this.capacidad = cantidad;
        this.descripcion = d;
        this.anioFabricacion = anio;
        this.valor = valor;
    }

    public double getValor(){return this.valor;}

    public int getCapacidad(){
        return this.capacidad;
    }

    public Conductor getConductor(){return this.conductor;}
}
