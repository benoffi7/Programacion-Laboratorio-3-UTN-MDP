/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Germán
 */
public class Ej15 {
    
    public static Scanner teclado;
    
    public static void menu() {
        teclado = new Scanner(System.in);
        int gradosC=0, gradosF=0;
        System.out.println("ingrese la cantidad de grados centigrados:");
        gradosC = teclado.nextInt();
        gradosF = 32 + (9*gradosC/5);
        System.out.println("la cantidad de grados Fahrenheit es de: " + gradosF);
        teclado.close();
    }
}
