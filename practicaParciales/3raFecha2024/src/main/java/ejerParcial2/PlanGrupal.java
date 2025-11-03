package ejerParcial2;

import ejercicio16.DateLapse;

public class PlanGrupal extends Plan{

    public PlanGrupal(double precioBase, int cantIP){
        super(precioBase,cantIP);
    }

    @Override
    public double calcularPrecioBase() {
        return 800 * this.getCantIp();
    }

    public double calcularPenalizacion(DateLapse periodo){
        long cantIPS = contarIpsEnPeriodo(periodo);
        return cantIPS > this.getCantIp() ? (cantIPS - this.getCantIp() * 500) : 0;
    }
}
