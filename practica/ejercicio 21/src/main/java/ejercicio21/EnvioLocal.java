package ejercicio21;
import  java.time.LocalDate;

public class EnvioLocal extends Envio{
    private boolean entregaRapida;

    public EnvioLocal (LocalDate fecha, String origen, String destino, double peso, boolean entregaRapida){
        super(fecha,origen,destino,peso);
        this.entregaRapida = entregaRapida;
    }

    public double getMonto(){
        if (entregaRapida){
            return 1500;
        }
        return 1000;
    }
}
