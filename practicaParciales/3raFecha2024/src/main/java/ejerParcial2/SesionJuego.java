package ejerParcial2;

import java.time.LocalDate;
import java.util.ArrayList;

public class SesionJuego extends Actividad {
    private int duracion;
    private ArrayList<Item> items;

    public SesionJuego(LocalDate fecha, String direccionIP, int duracion) {
        super(fecha, direccionIP);
        this.duracion = duracion;
        this.items = new ArrayList<Item>();
    }

    @Override
    public double calcularCosto() {
        if (this.duracion > 360){
            return this.items.stream()
                    .mapToDouble(i -> i.precioFinal())
                    .sum();
        }
        return 0;
    }
}
