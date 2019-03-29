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
public class Ejercicio19 {

    private static Scanner sc = new Scanner(System.in);
    private static Double[] array = new Double[31];
    private static Double average = null;
    private static Double lowest = null;
    private static Double highest = null;

    public static void setTemperatures() {
        for (int i = 1; i < array.length; i++) {
            System.out.println("Enter the temperature:");
            array[i] = sc.nextDouble();
        }
    }

    public static void calculateAverage() {
        double totalTemperature = 0;

        for (Double i : array) {
            totalTemperature += i;
        }
        average = (totalTemperature / array.length);
    }

    public static void calculateLowest() {
       lowest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < lowest) {
                lowest = array[i];
            }
        }
    }

    public static void calculateHighest() {
        highest= array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > highest) {
                highest = array[i];
            }
        }
    }
    
    public static void showResults(){
        System.out.println("The average is: "+average);
        System.out.println("The lowest is: "+lowest);
        System.out.println("The highest is: "+highest);
    
    }
}
