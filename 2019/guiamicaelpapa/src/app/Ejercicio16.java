/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author micae
 */
public class Ejercicio16 {

    /*Ejercicio nº16: Programa que lea por teclado el valor del radio 
    de una circunferencia y calcula y muestra por pantalla la longitud y
    el área de la circunferencia. Investigar el uso de la librería Math.
    Longitud de la circunferencia = 2*PI*Radio, Area de la 
    circunferencia = PI*Radio^2*/
    public static void LongitudYArea() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Radio: ");
        float radio = scan.nextFloat();

        float longitud = (float) (2 * Math.PI * radio);
        float area = (float) (radio * radio * Math.PI);

        System.out.println("Longitud: " + longitud);
        System.out.println("Area: " + area);
    }
}
