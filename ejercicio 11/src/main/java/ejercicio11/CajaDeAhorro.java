package ejercicio11;

public class CajaDeAhorro extends Cuenta {
    public CajaDeAhorro (){
        super();
    }

    public void depositar(double monto) {
        super.depositar(monto - (monto * 0.02));
    }

    public void extraerSinControlar( double monto) {
        super.extraerSinControlar(monto + (monto * 0.02));
    }

    protected boolean puedeExtraer (double monto){
        return this.getSaldo() >= monto + (monto * 0.02);
    }
}
