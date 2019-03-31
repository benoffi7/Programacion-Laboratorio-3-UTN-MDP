/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplab;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

    private static int[] array = new int[10];
    private static Scanner sc = new Scanner(System.in);
    private static Random rand = new Random();

    public static void setArreglo() {

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(20);
        }

    }

    public static void setArrayUser() {
        String opcion = "y";

        for (int i = 0; i < array.length && opcion.equals("y"); i++) {

            System.out.println("Enter a number to save: ");
            array[i] = sc.nextInt();

            System.out.println("¿Do you want to continue? (y/n)");
            opcion = sc.nextLine();

        }

    }

    public static void ShowArray() {
        System.out.print("The array contains the next numbers: ");
        for (int i : array) {
            System.out.print(" " + i);
        }
    }

    public static float getAverage() {

        int i;
        int sum = 0;

        for (i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return ((float) sum / (float) i);
    }
}
