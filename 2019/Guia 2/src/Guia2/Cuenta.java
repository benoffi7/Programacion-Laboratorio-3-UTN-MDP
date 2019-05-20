/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

/**
 *
 * @author Fede
 */
public class Cuenta {
    private float saldo;
    private String nombre;
    
    public Cuenta (String nuevoNombre){
        setSaldo(0);
        setNombre(nuevoNombre);
    }
    
    public Cuenta(float nuevoSaldo, String nuevoNombre){
        setSaldo(nuevoSaldo);
        setNombre(nuevoNombre);
    }
    
    /**
     * 
     * @param c monto a ingresar en la cuenta
     */
    public void ingresar(float c){
        setSaldo( getSaldo() + c);
    }
    
    /**
     * 
     * @param c monto a extraer de la cuenta
     */
    public void extraer(float c){
        setSaldo( getSaldo() - c);
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    private void setSaldo(float nuevoSaldo){
        saldo = nuevoSaldo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    private void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
}
