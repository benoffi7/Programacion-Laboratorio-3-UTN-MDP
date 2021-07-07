
package guia.uno;

import java.util.Scanner;

public class Ejercicio17 {
    private static Double kmh = null;
    private static Double ms = null;
    private static Scanner scan = new Scanner(System.in);
    
    public static void pedirVelocidad(){
        System.out.println("Ingrese la velocidad en km/h ->> ");
        kmh = scan.nextDouble();
    }
    
    public static void calcular(){
        ms = kmh*0.27777777777778;
        System.out.println("En metros por segundo ->> " + ms);
    }
}
