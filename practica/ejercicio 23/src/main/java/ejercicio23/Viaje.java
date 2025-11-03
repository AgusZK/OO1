package ejercicio23;

import java.time.LocalDate;
import java.util.ArrayList;

public class Viaje {
    private double costo;
    private String origen;
    private String destino;
    private LocalDate fechaSalida;
    private Vehiculo vehiculo;
    private ArrayList<Pasajero> pasajeros;

    public Viaje(double costo, String origen, String destino, LocalDate fecha, Vehiculo vehiculo){
        this.costo = costo;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fecha;
        this.vehiculo = vehiculo;
        this.pasajeros = new ArrayList<Pasajero>();
        this.vehiculo.getConductor().agregarViaje(this);
    }

    public ArrayList<Pasajero> getPasajeros() {
        return new ArrayList<Pasajero>(this.pasajeros);
    }

    public String getDestino(){ return this.destino;}

    public void registrarPasajero(Pasajero p){
        if (this.pasajeros.size() < this.vehiculo.getCapacidad() && p.getSaldo() > 0){
            this.pasajeros.add(p);
            p.agregarViaje(this);
        }
    }

    // Calculo para pasajeros y para el chofer
    public void cobrarCosto(){
        this.pasajeros.stream().forEach(p -> p.descontarSaldo(costo/this.pasajeros.size() + 1));
        this.vehiculo.getConductor().descontarSaldo(this.costo/this.pasajeros.size() + 1);
    }
}
