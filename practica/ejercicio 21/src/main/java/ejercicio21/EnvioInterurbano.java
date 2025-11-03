package ejercicio21;
import  java.time.LocalDate;

public class EnvioInterurbano extends Envio{
    private double distanciaEntre;

    public EnvioInterurbano(LocalDate fecha, String origen, String destino, double peso, double distancia){
        super (fecha,origen,destino,peso);
        this.distanciaEntre = distancia;
    }

    @Override
    public double getMonto() {
        if (distanciaEntre < 100){
            return 20 * this.getPeso();
        }
        else if (distanciaEntre <= 500){
            return 25 * this.getPeso();
        }
        else
            return 30 * this.getPeso();
    }
}
