package ejercicio23;

import java.util.ArrayList;
import java.util.stream.Collectors;

public abstract class Usuario {
    private String nombre;
    private double saldo;
    private ArrayList<Viaje> viajes;

    public Usuario(String nombre, double saldo){
        this.nombre = nombre;
        this.saldo = saldo;
        this.viajes = new ArrayList<Viaje>();
    }

    public double getSaldo(){
        return this.saldo;
    }

    public ArrayList<Viaje> getViajes(){
        return new ArrayList<Viaje>(this.viajes);
    }

    public void agregarViaje(Viaje v){
        this.viajes.add(v);
    }

    public void cargarSaldo(double monto){
        this.saldo += monto;
    }

    public void descontarSaldo(double monto){
        this.saldo = monto - this.calcularDescuento();
    }

    public String listarDestinos(){
        return this.viajes.stream()
                .map(Viaje::getDestino)
                .collect(Collectors.joining(", "));
    }

    public abstract double calcularDescuento();
}
