/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;
import java.util.Scanner;
/**
 * Escribir un programa que lea un número entero por teclado y obtenga y muestre
 * por pantalla el doble y el triple de ese número.
 *
 * @author Fede
 */
public class Ejercicio13 {
    public static Scanner teclado;
    public static void iniciar(){
        teclado= new Scanner(System.in);
        System.out.println("Se mostrara el doble y el triple del valor ingresado");
        System.out.println("Ingrese un numero");
        float numero = teclado.nextFloat();
        
        float doble = Ejercicio10.multiplicar(numero, 2);
        float triple = Ejercicio10.multiplicar(numero, 3);
        System.out.println("Su doble es "+ doble);
        System.out.println("Su triple es "+ triple);
        
        teclado.close();
    }
}
