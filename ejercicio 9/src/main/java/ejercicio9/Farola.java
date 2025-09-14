package ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Farola {
    private boolean prendida;
    private ArrayList<Farola> listaF;

    /* Crear una farola. Debe inicializarla como apagada */
    public Farola(){
        this.prendida = false;
        this.listaF = new ArrayList<Farola>();
    }

    /* Crea la relación de vecinos entre las farolas.
       La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje
       será vecino de otraFarola, al igual que otraFarola también se convertirá
       en vecina del receptor del mensaje
    */
    public void agregarFarola(Farola f){
        this.listaF.add(f);
    }

    public void pairWithNeighbor( Farola otraFarola ){
        if (!this.listaF.contains(otraFarola)){
            // LA AGREGO COMO VECINO EN LA LISTA DE LA FAROLA
            // Y AGREGO LA FAROLA (THIS) COMO VECINO DE LA NUEVA
            this.agregarFarola(otraFarola);
            otraFarola.agregarFarola(this);
        }
    }

    public List<Farola> getNeighbors(){
        return new ArrayList<Farola>(this.listaF);
    }

    /* * Retorna true si la farola está encendida. */
    public boolean isOn(){
        return this.prendida;
    }

    /* * Retorna true si la farola está apagada. */
    public boolean isOff(){
        return !this.prendida;
    }

    /* * Si la farola no está encendida, la enciende y propaga la acción.*/
    public void turnOn(){
        // PRENDO LA FAROLA SI NO ESTA PRENDIDA
        if (!this.isOn()){
            this.prendida = true;
            // PRENDO TODAS LAS VECINAS
            for (Farola f: listaF){
                f.turnOn();
            }
        }

    }

    /* * Si la farola no está apagada, la apaga y propaga la acción. */
    // HAGO LO MISMO PARA APAGARLAS
    public void turnOff(){
        if (this.isOn()){
            this.prendida = false;
            for (Farola f: listaF){
                f.turnOff();
            }
        }
    }
}