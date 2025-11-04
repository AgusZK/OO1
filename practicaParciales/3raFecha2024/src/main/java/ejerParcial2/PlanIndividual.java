package ejerParcial2;

import ejercicio16.DateLapse;

public class PlanIndividual extends  Plan{
    private int minutosContratados;

    public PlanIndividual(double precioBase, int minutosContratados){
        super(precioBase, 1);
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
