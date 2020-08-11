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
public class Ej18 {
    public static Scanner teclado;
    
    public static void menu() {
        teclado = new Scanner(System.in);
        double hipotenusa=0, cateto1=0, cateto2=0;
        System.out.println("ingrese el valor del cateto 1");
        cateto1 = teclado.nextDouble();
        System.out.println("ingrese el valor del cateto 2");
        cateto2 = teclado.nextDouble();
        hipotenusa = Math.hypot(cateto1, cateto2);
        System.out.println("la longitud de la hipotenusa es: " + hipotenusa);
        teclado.close();
    }
}
