package ejercicio4;
import java.util.ArrayList;
import java.util.List;

public class Balanza{
    private List<Producto> lista;

    // INICIALIZO BALANZA PARA QUE NO SE ROMPAN LOS TEST
    public Balanza(){
        this.ponerEnCero();
    }
    public void ponerEnCero(){
        this.lista = new ArrayList<Producto>();
    }

    public void agregarProducto (Producto p){
        this.lista.add(p);
    }

    public Ticket emitirTicket() {
        Ticket t = new Ticket(this.getCantidadDeProductos(), this.getPesoTotal(), this.getPrecioTotal());
        this.ponerEnCero();
        return t;
    }

    // RECORRO LISTA PARA PRECIO Y PESO
    public double getPesoTotal() {
        double suma = 0;
        for (int i = 0 ; i < lista.size() ; i++){
            suma+= lista.get(i).getPeso();
        }
        return suma;
    }

    public double getPrecioTotal() {
        double suma = 0;
        for (int i = 0 ; i < lista.size() ; i++){
            suma+= lista.get(i).getPrecio();
        }
        return suma;
    }

    public int getCantidadDeProductos() {
        return this.lista.size();
    }
}
