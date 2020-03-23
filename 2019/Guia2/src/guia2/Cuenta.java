package guia2;
import java.util.Scanner;
public final class Cuenta {
    private String nombre;
    private double saldo;
    static Scanner sc = new Scanner(System.in);
    public Cuenta(){
        setNombre("");
        setSaldo(0);
    }
    public Cuenta(String nombre,double saldo){
        setNombre(nombre);
        setSaldo(saldo);
    }
    public Cuenta(String newName){
        setNombre(newName);
        setSaldo(0);
    }
    public String getNombre(){
        return nombre;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setNombre(String nombreRecibido){
        nombre = nombreRecibido;
    }
    public void setSaldo(double saldoRecibido){
        saldo = saldoRecibido;
    }
    public double ingresaDinero(double dinero){
        setSaldo(getSaldo()+dinero);
        return getSaldo();
    }
    public double retiraDinero(double retira){ //En caso de que intente sacar más del saldo que hay, la cuenta quedara en negativo
        setSaldo(getSaldo()-retira);
        return getSaldo();
    }
}
