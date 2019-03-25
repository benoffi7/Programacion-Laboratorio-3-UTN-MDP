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
public class Ejercicio13 {
    /*Ejercicio nº13: Programa que lea un nombre y muestre por pantalla:
    “Buenos dias nombre_introducido”.*/
    
    public static void saludo(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nombre: ");
        String nombre = scan.next();
        System.out.println("Buenos dias "+nombre);
    }
}
