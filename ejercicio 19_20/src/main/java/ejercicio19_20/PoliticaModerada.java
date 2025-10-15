package ejercicio19_20;

public class PoliticaModerada implements Politica {
    public double reembolso(Reserva r){
        if (r.cantDias() >= 7){
            return r.precio();
        }
        if (r.cantDias() > 2 ){
            return r.precio()/2;
        }
        return  0;
    }
}
