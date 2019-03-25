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
public class Ejercicio6 {

    /*Ejercicio nº6: Ingresar un número o tantos como quiera el usuario 
    y revisar si es primo*/

    public static void SaberSiEsPrimo() {
        boolean condicion = false;
        Scanner scan = new Scanner(System.in);

        System.out.println("Numero: ");
        int primo = scan.nextInt();

        for (int j = (primo - 1); j > 1; j--) {
            if (primo % j == 0) {
                condicion = true;
            }
        }

        if (primo > 1) {
            if (condicion == false) {
                System.out.println("Es primo");
            } else {
                System.out.println("No es primo");
            }
        } else {
            System.out.println("No es primo");
        }
    }
}
