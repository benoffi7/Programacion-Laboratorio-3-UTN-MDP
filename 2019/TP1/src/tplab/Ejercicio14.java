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
public class Ejercicio14 {

    private static Scanner sc = new Scanner(System.in);
    private static int number;
    private static int doble;
    private static int triple;

    public static void calculateDoubleAndTriple() {

        System.out.println("Enter a number:");
        number = sc.nextInt();
        doble = number * 2;
        triple = number * 3;
        System.out.println("The number: " + number + ", his double is " + doble + " and his triple is " + triple);
    }
}
