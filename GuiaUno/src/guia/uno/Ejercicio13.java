
package guia.uno;

import java.util.Scanner;

public class Ejercicio13 {
    private static String nombre = " ";
    private static Scanner scan = new Scanner(System.in);
    
    public static void pedirNombre(){
        System.out.println("Ingrese su nombre ->>");
        nombre = scan.nextLine();
    }
    
    public static void mostrarNombre(){
        System.out.println("Buenos dias " + nombre);
    }        
    
}
