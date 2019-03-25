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
public class Ej16 {
    
    public static Scanner teclado;
    
    public static void menu() {
        teclado = new Scanner(System.in);
        int radio=0, longitud=0, area=0;
        System.out.println("ingrese el radio:");
        radio = teclado.nextInt();
        longitud = (int) (2*Math.PI*radio);
        System.out.println("la longitud es: " + longitud);
        area = (int) (Math.PI*Math.pow(radio, 2));
        System.out.println("el area es: " + area);
        teclado.close();
    }
}
