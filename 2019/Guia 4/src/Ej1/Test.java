/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1;



/**
 *
 * @author Fede
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        A a;
        B b = new B();
        C c = new C();
        System.out.print("Métodos llamados con objeto b desde");
        System.out.println("referencia de la clase A");
        a = b;
        a.dinamica();
        a.estatica();
        System.out.print("Métodos llamados con objeto c desde");
        System.out.println(" referencia de la clase A");
        a = c;
        a.dinamica();
        a.estatica();
    }

}
