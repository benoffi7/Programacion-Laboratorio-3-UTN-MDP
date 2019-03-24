
package guia.uno;

import java.util.Scanner;


public class Ejercicio10 {
    private static char caracter;
    private static Scanner scan = new Scanner(System.in);
    
    public static void saberValor(){
        System.out.println("Ingrese un caracter ->> ");
        caracter = scan.next().charAt(0);
        System.out.println("Valor ASCII ->> " + (int)caracter);
    }
}
