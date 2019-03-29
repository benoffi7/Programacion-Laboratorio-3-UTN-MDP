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
public class Ejercicio10 {
        private static Scanner sc = new Scanner(System.in);

    public static void charValue(){
        char character;
        System.out.println("Enter a character");
        character = sc.next().charAt(0);
        System.out.println("The ASCII value is: " + (int)character);
    }
}
