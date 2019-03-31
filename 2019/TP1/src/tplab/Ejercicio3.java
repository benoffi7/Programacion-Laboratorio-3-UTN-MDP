/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplab;

/**
 *
 * @author Facu
 */
public class Ejercicio3 {
    private static int Divisors;

    public static void ShowPrimeNumbers() {
        
        for (int i = 1; i < 100; i++) {
            Divisors=0;
            for (int j = 1; j <= i; j++) {

                if (i%j==0) {
                    Divisors++;
                }
            }
            if (Divisors == 2) {
                    System.out.println(i+ " is a PrimeNumber ");
                }
        }
    }
}
