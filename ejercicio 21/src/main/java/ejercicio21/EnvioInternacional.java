package ejercicio21;
import  java.time.LocalDate;

public class EnvioInternacional extends Envio {
    private boolean entregaRapida;

    public EnvioInternacional(LocalDate fecha, String origen, String destino, double peso, boolean entregaRapida){
        super(fecha,origen,destino,peso);
        this.entregaRapida = entregaRapida;
    }

    @Override
    public double getMonto() {
        if (this.getPeso() <= 1000) {
            if (entregaRapida) {
                return (5000 + 10 * this.getPeso() + 800);
                }
            else return 5000 + 10 * this.getPeso();
        } else if (entregaRapida){
            return (5000 + 12 * this.getPeso() + 800);
            }
            else return 5000 + 12 * this.getPeso();
    }
}
