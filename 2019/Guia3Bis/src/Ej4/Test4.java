/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej4;

/**
 *
 * @author Fede
 */
public class Test4 {
    public static void main (String[] args) {
        Hora reloj = new Hora (10,0,0);
        
        System.out.println(reloj.toString());
        
        reloj.retrocederSegundo();        
        System.out.println(reloj.toString());
        
        reloj.avanzarSegundo();
        System.out.println(reloj.toString());
        reloj.avanzarSegundo();
        System.out.println(reloj.toString());
        reloj.avanzarSegundo();
        System.out.println(reloj.toString());
        reloj.avanzarSegundo();
        System.out.println(reloj.toString());
    }
}
