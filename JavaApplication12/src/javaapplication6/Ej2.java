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
public class Ej2 {
    
    public static Scanner teclado;
    
    public static void menu() {
        teclado = new Scanner(System.in);
        System.out.println("ingrese un numero para comprobar si es o no par");
        int numero = teclado.nextInt();
        if (numero%2==0)
            System.out.println("El número es par");
        else
            System.out.println("El número es impar");
        teclado.close();
    }
}
