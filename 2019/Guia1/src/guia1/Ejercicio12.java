/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;
import java.util.Scanner;
/**
 * Programa que lea un nombre y muestre por pantalla: "Buenos dias
 * nombre_introducido"
 *
 * @author Fede
 */
public class Ejercicio12 {

    public static Scanner teclado;
    
    public static void iniciar() {
        teclado=new Scanner(System.in);
        System.out.println("Ingrese un nombre");
        String nombre_introducido= teclado.next();
        
        System.out.println("Buenos dias "+ nombre_introducido);
        
        teclado.close();
    }
}
