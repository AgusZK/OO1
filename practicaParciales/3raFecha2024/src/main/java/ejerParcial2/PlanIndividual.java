package ejerParcial2;

import ejercicio16.DateLapse;

public class PlanIndividual extends  Plan{
    private int minutosContratados;

    public PlanIndividual(double precioBase, int cantIp, int minutosContratados){
        super(precioBase,cantIp);
        this.minutosContratados = minutosContratados;
    }

    public double calcularPrecioBase() {
        return 20 * this.minutosContratados;
    }

    @Override
    public double calcularPenalizacion(DateLapse periodo) {
        long cantIPS = contarIpsEnPeriodo(periodo);
        return cantIPS > 1 ? (cantIPS - 1) * 300 : 0;
    }
}
