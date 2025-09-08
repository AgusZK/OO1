package ejercicio4;

public class Producto{
    private double peso;
    private double precioPorKilo;
    private String descripcion;

    public Producto (String descripcion , double peso, double precioPorKilo){
        this.descripcion = descripcion;
        this.precioPorKilo = precioPorKilo;
        this.peso = peso;
    }

    public double getPrecio(){
        return this.precioPorKilo * this.peso;
    }

    public double getPeso(){
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecioPorKilo() {
        return precioPorKilo;
    }

    public void setPrecioPorKilo(double precioPorKilo) {
        this.precioPorKilo = precioPorKilo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}