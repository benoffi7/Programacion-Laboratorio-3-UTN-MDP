/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 * Programa que lea por teclado el valor del radio de una circunferencia y
 * calcula y muestra por pantalla la longitud y el área de la circunferencia.
 * Investigar el uso de la librería Math. 
 * Longitud de la circunferencia = * 2*PI*Radio, 
 * Area de la circunferencia = PI*Radio^2
 *
 * @author Fede
 */
public class Ejercicio15 {
    public static Scanner teclado;
    
    public static void iniciar(){
        teclado= new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        float radio = teclado.nextFloat();
        
        float longitud = longitudCirculo(radio);
        float area= Ejercicio11.calcularCirculo(radio);
        
        System.out.println("La longitud del circulo es "+ longitud);
        System.out.println("El area del circulo es "+ area);
        
        teclado.close();
    }
    
    public static float longitudCirculo(float radio){
        return 2 *(float)Math.PI * radio;
    }
}
