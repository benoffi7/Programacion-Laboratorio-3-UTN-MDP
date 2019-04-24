package Clases;

public class MaquinaExpendedora {

    private double saldo;
    private double precio;
    private int total;


    public MaquinaExpendedora(double saldo, double precio, int total){
        this.saldo = saldo;
        this.precio = precio;
        this.total = total;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getTotal() {
        return total;
    }


    public double obtenerSaldo(){
        return getSaldo();
    }

    public double obtenerPrecio(){
        return getPrecio();
    }

    public void ingresarDinero(double cantidad){

        if( cantidad > 0 ) {
            this.saldo += cantidad;
        }
    }

    public void imprimirBoleto(){
        this.total  -= 1 ;
    }

    public double darVuelto(double cantidad){

        double resto = cantidad - getPrecio();
        this.saldo -= resto;
        return resto;
    }

    public int obtenerBoletosRestantes(){
        return getTotal();
    }



}
