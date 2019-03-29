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
public class Ejercicio17 {

    private static Scanner sc = new Scanner(System.in);
    private static Double kmh = null;
    private static Double ms = null;

    public static void setSpeed() {
        System.out.println("Enter the speed: ");
        kmh = sc.nextDouble();
    }

    public static void calculateKmhToMs() {
        ms = kmh * 0.277778;

    }
    
    public static void showSpeeds(){
        System.out.println("The KM/H: "+kmh);
        System.out.println("The M/S: "+ms);
    }
}
