
package guia.uno;

import java.util.Scanner;


public class Ejercicio15 {
    private static Float cent = null;
    private static Float fahr = null;
    private static Scanner scan = new Scanner(System.in);
    
    public static void pedirCentigrado(){
        System.out.println("Ingrese la temperatura en grados centígrados ->>");
        cent = scan.nextFloat();  
    }
    
    public static void conversorFahrenheit(){
        fahr = 32 + (9*cent/5);
        
    }
    
    public static void mostrarFahrenheit(){
        System.out.println("La temperatura en grados Fahrenheit es ->> " + fahr);
    }
}
