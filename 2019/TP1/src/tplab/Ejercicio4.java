/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplab;

import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Ejercicio4 {
    private static int Divisiors;
    private static int quantity;
    private static Scanner scan = new Scanner(System.in);
    
    public static void showPrimeNumbersWithQuantity() {
        
        System.out.println("Enter the quantity");
        quantity = scan.nextInt();
        
        for (int i = 1; i < quantity; i++) {
            Divisiors=0;
            for (int j = 1; j <= i; j++) {

                if (i%j==0) {
                    Divisiors++;
                }
            }
            if (Divisiors == 2) {
                    System.out.println(i+ " is a PrimeNumber ");
                }
        }
    }
}
