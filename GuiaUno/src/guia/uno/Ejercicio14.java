
package guia.uno;

import java.util.Scanner;

public class Ejercicio14 {
    private static Integer numero = null;
    private static Integer doble = null;
    private static Scanner scan = new Scanner(System.in);
    
    public static void calcular(){
        
        System.out.println("Ingrese un número ->>");
        numero = scan.nextInt();
        doble = numero+numero;
        System.out.println("El doble del número es " + doble + ", y el triple es " + (doble+numero));
        
    }
}
