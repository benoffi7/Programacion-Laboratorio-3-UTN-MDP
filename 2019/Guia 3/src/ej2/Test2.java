/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

/**
 *
 * @author Fede
 */
public class Test2 {
    public static void main(String[] args){
        Cliente c = new Cliente(123,"Federico Anastasi",'M');
        System.out.println(c.toString());
        
        Cuenta miCuenta = new Cuenta(7777, 10000, c);
        
        miCuenta.ingresar(5000);
        System.out.println("Nuevo balance: "+ miCuenta.getBalanace());
        
        if(miCuenta.extraer(10000)){
            System.out.println("Se extrajo dinero, nuevo balance: "+ miCuenta.getBalanace());
        }else{
            System.out.println("La cuenta no posee saldo suficiente para realizar la operacion");
        }
        
        if(miCuenta.extraer(999999)){
            System.out.println("Se extrajo dinero, nuevo balance: "+ miCuenta.getBalanace());
        }else{
            System.out.println("La cuenta no posee saldo suficiente para realizar la operacion");
        }
        
        
        
    }
}
