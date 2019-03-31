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
public class Ejercicio22 {
    
    private static Scanner sc = new Scanner(System.in);
    private static int number;

    public static void setNumber() {

        do {
            System.out.println("Enter a number higher than 0");
            number = sc.nextInt();

            if (number <= 0) {
                System.out.println("The number should be higher than 0");
            }

        } while (number <= 0);

        
    }

    public static void calculateQuantityFigures() {
        int quantity = 0;   
        while(number > 0){
            number = number/10;
            quantity+=1;
        }
        showQuantityFigures(quantity);
    }
    
    public static void showQuantityFigures(int quantity){
        System.out.println("The amount of figures are: "+quantity);
    }
}

    