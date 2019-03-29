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
public class Ejercicio18 {

    private static Scanner sc = new Scanner(System.in);
    private static Double first_cateto = null;
    private static Double second_cateto = null;
    private static Double hypotenuse = null;

    public static void setCatetos() {
        System.out.println("Enter the first cateto: ");
        first_cateto = sc.nextDouble();

        System.out.println("Enter the second cateto: ");
        second_cateto = sc.nextDouble();

    }

    public static void setHypotenuse() {
        hypotenuse = Math.sqrt(Math.pow(first_cateto, 2) + Math.pow(second_cateto, 2));

    }

    public static void showDetails() {
        System.out.println("First Cateto: " + first_cateto);
        System.out.println("Second Cateto: " + second_cateto);
        System.out.println("Hypotenuse: " + hypotenuse);
    }
    
    
}
