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

    // PASAR ANTIGUEDAD COMO PARAMETRO Y PREGUNTAR ACA LA CANTIDAD DE ANOIS DE ANTIGUEDAD (HACER ESTO ARRIBA)
    public double calcularPenalizacion(DateLapse periodo){
        long cantIPS = contarIpsEnPeriodo(periodo);
        return cantIPS > this.getCantIp() ? (cantIPS - this.getCantIp() * this.montoPenalizacion(antiguedad)) : 0;
    }
    // METODO CORRECOT, PASAS PERIODO AL METODO DE ARRIBA
    @Override
    public double montoPenalizacion(int antiguedad) {
        return antiguedad > 10 ? 0 : 500;
    }
}
