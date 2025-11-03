package ejercicio21;

import java.util.ArrayList;
import ejercicio16.DateLapse;

public abstract class Cliente {
    private String nombre;
    private String direccion;
    private ArrayList<Envio> envios;

    public Cliente (String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.envios = new ArrayList<Envio>();
    }

    public void agregarEnvio(Envio e){
        this.envios.add(e);
    }

    public double montoAPagarEnvios(DateLapse periodo){
        return this.envios.stream()
                .filter(f -> periodo.includesDate(f.getFechaDespacho()))
                .mapToDouble(monto -> this.calcularMonto(monto.getMonto()))
                .sum();
    }

    public ArrayList<Envio> getEnvios(){
        return new ArrayList<Envio>(this.envios);
    }

    public abstract double calcularMonto(double precio);
}
