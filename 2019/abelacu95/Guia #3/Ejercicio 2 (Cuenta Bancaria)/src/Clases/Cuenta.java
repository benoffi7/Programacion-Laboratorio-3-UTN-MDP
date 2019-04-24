package Clases;

public class Cuenta {

    private int nroCuenta;
    private double saldo;
    Cliente cliente;


    public Cuenta(int nroCuenta, double saldo, Cliente cliente){
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    private double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void depositar(double cantidad){
        this.saldo += cantidad;
    }

    public void extraer(double cantidad){
        this.saldo -= cantidad;
    }

    public double consultarSaldo(){
        return getSaldo();
    }

}
