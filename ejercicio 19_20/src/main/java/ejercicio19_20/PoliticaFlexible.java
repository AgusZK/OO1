package ejercicio19_20;

public class PoliticaFlexible implements  Politica {
    public double reembolso(Reserva r){
        return r.precio();
    }
}
