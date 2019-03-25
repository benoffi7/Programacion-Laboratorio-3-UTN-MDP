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
public class Ej7 {
    
    public static Scanner teclado;
    
    public static void menu(){
        teclado = new Scanner(System.in);
        int r=0, i=0;
        while(i<10) {
            i++;
            System.out.println(i);
            r = r + i;
        }
        System.out.println(r);
        teclado.close();
    }
}
