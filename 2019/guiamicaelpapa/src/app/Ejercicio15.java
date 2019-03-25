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
public class Ejercicio15 {

    /*Ejercicio nº15: Programa que lea una cantidad de grados centígrados
y la pase a grados Fahrenheit. La fórmula correspondiente para pasar de 
grados centígrados a fahrenheit es:  F = 32 + ( 9 * C / 5)*/

    public static void CentigradosAFarenheit() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Grados centigrados: ");
        float centigrados = scan.nextFloat();
        float farenheit = (9 * centigrados / 5) + 32;
        System.out.println("Grados farenheit: "+farenheit);
        
    }

}
