package ejercicio3;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
    private LocalDate fecha;
    private String cliente;
    private List<Item> listaItems;

    public Presupuesto (String c){
        this.fecha = LocalDate.now();
        this.cliente = c;
        this.listaItems = new ArrayList<Item>();
    }

    public void agregarItem (Item item){
        this.listaItems.add(item);
    }

    // CALCULA TOTAL RECORRIENDO LISTA DE OBJETOS ITEM
    public double calcularTotal(){
        int suma = 0;
        for(int i = 0 ; i < listaItems.size() ; i++){
            suma += listaItems.get(i).costo();
        }
        return suma;
    }


    public String getCliente() {
        return this.cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}
