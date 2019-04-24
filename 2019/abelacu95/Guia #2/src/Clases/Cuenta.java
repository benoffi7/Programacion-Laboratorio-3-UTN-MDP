package Clases;

public class Cuenta {

    private float saldo;

    public Cuenta(float saldo){
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void ingresarDinero(float dinero){
        this.saldo += dinero;
    }

    public void extraer(float dinero){
        this.saldo -= dinero;
    }

    public float mostrarSaldo(){
        return getSaldo();
    }

}
