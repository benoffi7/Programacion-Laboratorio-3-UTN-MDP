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
public class Ej14 {
    
    public static Scanner teclado;
    
    public static void menu() {
        teclado = new Scanner(System.in);
        int numero=0, doble=0, triple=0;
        System.out.println("ingrese un numero entero");
        numero = teclado.nextInt();
        doble = numero * 2;
        System.out.println("el doble es: " + doble);
        triple = numero * 3;
        System.out.println("el triple es: " + triple);
        teclado.close();
    }
}
