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
        Rectangle r1 = new Rectangle(3, 5);
        
        System.out.println(r1.toString());
        
        System.out.println("Perimetro: "+ r1.calculatePerimeter());
        System.out.println("Area: "+ r1.calculateArea());
        System.out.println("");
        
        r1.cambiarAltura(2);
        r1.cambiarAncho(2);
        System.out.println("Perimetro: "+ r1.calculatePerimeter());
        System.out.println("Area: "+ r1.calculateArea());
        System.out.println("");
        
        Rectangle r2= new Rectangle();
            
        System.out.println(r2.toString());
        
        System.out.println("Perimetro: "+ r2.calculatePerimeter());
        System.out.println("Area: "+ r2.calculateArea());
        
    }
    
}
