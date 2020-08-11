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
public class Ej13 {
    
    public static Scanner teclado;
    
    public static void menu() {
        teclado = new Scanner(System.in);
        String nombre;
        System.out.println("ingrese un nombre");
        nombre = teclado.next();
        System.out.println("buenos dias, " + nombre);
        teclado.close();
    }
}
