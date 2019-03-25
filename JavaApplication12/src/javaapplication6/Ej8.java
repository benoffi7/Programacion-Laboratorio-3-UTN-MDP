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
public class Ej8 {
    
    public static Scanner teclado;
    
    public static void menu() {
        teclado = new Scanner(System.in);
        int numero=0, i=0;
        char res = 's';
        while(res == 's'){
            System.out.println("ingrese un numero entero");
            numero = teclado.nextInt();
            i++;
            System.out.println("desea seguir ingresando? s/n ");
            res = (teclado.next()).charAt(0);
        }
        System.out.println("la cantidad de elementos ingresados es de:");
        System.out.println(i);
    }
}
