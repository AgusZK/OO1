package ejercicio14;

import java.util.ArrayList;

public class ReporteDeConstruccion {
    private ArrayList<Pieza> piezas;

    public ReporteDeConstruccion(){
        this.piezas = new ArrayList<Pieza>();
    }

    public void agregarPieza(Pieza p){
        this.piezas.add(p);
    }

    // FILTRO POR NOMBRE/COLOR Y SUMO LAS PIEZAS QUE CUMPLAN
    public double volumenDeMaterial(String nombre){
        return this.piezas.stream()
                .filter(Pieza -> Pieza.getMaterial().equals(nombre))
                .mapToDouble(p -> p.volumen()).sum();
    }

    public double superficieDeColor(String color){
        return this.piezas.stream()
                .filter(Pieza -> Pieza.getColor().equals(color))
                .mapToDouble(p -> p.superficie()).sum();
    }
}
