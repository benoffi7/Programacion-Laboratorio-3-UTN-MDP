/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guianro2;


public class Cuenta {

    private float saldo;

    private final int id;
    
    private static int id_cantidad;
    
   

    public Cuenta() {

        saldo = 0;
        id = (id_cantidad += 1);
        

    }

    public Cuenta(float saldoIngresado) {
        
        id=(id_cantidad+=1);
        saldo=saldoIngresado;

    }

    public int getId() {
        return id;
    }

    public float getSaldo(){
        
        return saldo;
        
    }
   
    
    private void setSaldo(float saldoIngresado){
        
        saldo=saldoIngresado;
        
        
    }
    /*
    public void setNroOp(int nroOpIngresado){
        
        nroOp=nroOpIngresado;
    }
    */
    public void ingresarSaldo(float montoIngresado){
        
        setSaldo(saldo+montoIngresado);
        
    }
    
    public void extraerSaldo(float montoExtraido){
        
        if (montoExtraido<saldo) {
            
        
        setSaldo(saldo-montoExtraido);
    }else{
            System.out.println("Su monto a extraer no puede ser mayor al que tiene");
        }
    }
}
