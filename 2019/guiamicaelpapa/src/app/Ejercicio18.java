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
public class Ejercicio18 {

    /*Ejercicio nº18: Programa que lea la longitud de los catetos
    de un triángulo rectángulo y calcule la longitud de la hipotenusa 
    según el teorema de Pitágoras.*/

    public static void Hipotenusa() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cateto 1: ");
        float cateto1 = scan.nextFloat();
        System.out.println("Cateto 2: ");
        float cateto2 = scan.nextFloat();

        float hipotenusa = (cateto1 * cateto1) + (cateto2 * cateto2);
        hipotenusa = (float) Math.sqrt(hipotenusa);

        System.out.println("hipotenusa: " + hipotenusa);
    }
}
