
package guia.dos;


public class Cuenta {
    private final int ID;
    private static int cantCuentas;
    private float saldo;
    
    public Cuenta(){
        ID = (cantCuentas += 1);
        saldo = 0;
    }
    
    
    public Cuenta(Float saldoIngresado){
        ID = (cantCuentas += 1);
        saldo = saldoIngresado;
    }
    
    private void setSaldo(Float saldo){ //Es privado porque la unica forma de setear el saldop es extrayendo o ingresando dinero
        this.saldo = saldo;
    }
    
    public void ingresarDinero(Float dinero){
        setSaldo(saldo + dinero);
    }
    
    public void sacarDinero(Float dinero){
        setSaldo(saldo-dinero);
    }
    
    public Float getSaldo(){
        return saldo;
    }
    
    public int getId(){
        return ID;
    }
    
    public boolean comprobarExtraccion(float monto){
        return monto <= getSaldo();
    }
}
