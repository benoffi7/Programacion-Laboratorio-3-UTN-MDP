/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author micae
 */
public class Ejercicio14 {
    /*Ejercicio nº14: Escribir un programa que lea un número entero
    por teclado y obtenga y muestre por pantalla el doble y el triple
    de ese número.*/
    
    public static void Productos()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Numero: ");
        int num = scan.nextInt();
        System.out.println("Doble: "+(num*2));
        System.out.println("Triple: "+(num*3));
    }
}
