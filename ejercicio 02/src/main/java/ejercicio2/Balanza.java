package ejercicio2;

public class Balanza{
    private int cantidadDeProductos;
    private double precioTotal;
    private double pesoTotal;

    public void ponerEnCero(){
        this.cantidadDeProductos = 0;
        this.pesoTotal = 0;
        this.precioTotal = 0;
    }

    public void agregarProducto (Producto p){
        this.cantidadDeProductos+= 1;
        this.precioTotal += p.getPrecio();
        this.pesoTotal += p.getPeso();
    }

    public Ticket emitirTicket() {
        return new Ticket(this.cantidadDeProductos, this.pesoTotal, this.precioTotal);
    }

    public double getPesoTotal() {
        return this.pesoTotal;
    }

    public double getPrecioTotal() {
        return this.precioTotal;
    }

    public int getCantidadDeProductos() {
        return this.cantidadDeProductos;
    }
}
