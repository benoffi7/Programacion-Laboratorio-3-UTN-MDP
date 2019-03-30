package Main;

public class Cuenta {

    private float saldo = 0;
    private int nCuenta = 0;

    private int cuentaRecibido =0;
    private float saldoRecibido =0;

    //Constructores
    public Cuenta() {

    }

    public Cuenta(float saldo){
        setSaldo(saldo);
    }

    public Cuenta(float saldo, int nCuenta) {
        setSaldo(saldo);
        setnCuenta(nCuenta);
    }

    //GETTERS & SETTERS
    public int getCuenta() {
        return nCuenta;
    }

    private void setnCuenta(int cuentaRecibida) {
        nCuenta = cuentaRecibida;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldoRecibido) {
        saldo = saldoRecibido;
    }

    //METODOS

    public static boolean controlCuenta(int nCuenta){
        if(nCuenta !=0)
            return true;
        else
            return false;
    }

    public void ingresar(float ingreso, float saldo){

        float suma =saldo + ingreso;
        setSaldo(suma);
    }

    public boolean control(float saldo, float retiro){
        if(saldo >= retiro){
            return true;
        }
        else
            return false;
    }

    public void extraer(float saldo,float retiro){

        if(control(saldo,retiro) == true){
            float resta = saldo - retiro;
            setSaldo(resta);
        }
    }
}