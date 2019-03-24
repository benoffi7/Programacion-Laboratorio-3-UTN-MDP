/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.uno;

import java.util.Scanner;

/**
 *
 * @author natal
 */
public class Ejercicio16 {
    private static Double radio = null;
    private static Double area = null;
    private static Double longitud = null;
    private static Scanner scan = new Scanner(System.in);
    
    public static void pedirRadio(){
        System.out.println("Ingrese el radio de la circunferencia ->> ");
        radio = scan.nextDouble();
    }
    
    public static void calcularLongitud(){
        longitud = (2*Math.PI*radio);
        System.out.println("La longitud de la circunferencia es ->> " + longitud);
    }
    
    public static void calcularArea(){
        area = ( Math.PI * Math.pow(radio, 2) );
        System.out.println("El área de la circunferencia es ->> " + area);
    }
}
