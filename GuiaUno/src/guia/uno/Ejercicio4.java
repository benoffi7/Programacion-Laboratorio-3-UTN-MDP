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
public class Ejercicio4 {
    private static int cantDivisores;
    private static Integer n = null;
    private static Scanner scan = new Scanner(System.in);
    
    public static void mostrar() {
        
        System.out.println("Ingrese el límite");
        n = scan.nextInt();
        
        for (int i = 1; i < n; i++) {
            cantDivisores=0;
            for (int j = 1; j <= i; j++) {

                if (i%j==0) {
                    cantDivisores++;
                }
            }
            if (cantDivisores == 2) {
                    System.out.println(" " + i);
                }
        }
    }
}
