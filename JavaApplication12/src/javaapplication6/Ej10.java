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
public class Ej10 {
    
    public static Scanner teclado;
    
    public static void menu() {
        teclado = new Scanner(System.in);
        char letra;
        System.out.println("ingrese un caracter para mostrar su codigo ASCII");
        letra = (teclado.next()).charAt(0);
        int valorascii = (int) letra;
        System.out.println(valorascii);
    }
}
