/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.uno;

/**
 *
 * @author Matias
 */
public class Ejercicio3 {

    private static int cantDivisores;

    public static void mostrar() {
        
        for (int i = 1; i < 100; i++) {
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
