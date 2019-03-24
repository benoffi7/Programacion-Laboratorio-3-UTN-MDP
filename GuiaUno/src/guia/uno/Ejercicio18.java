
package guia.uno;

import java.util.Scanner;

public class Ejercicio18 {
    private static Double cateto1 = null;
    private static Double cateto2 = null;
    private static Double hipotenusa = null;
    private static Scanner scan = new Scanner(System.in);
    
    public static void pedirMedidas(){
        System.out.println("Ingrese la medida del primer cateto ->> ");
        cateto1 = scan.nextDouble();
        scan.nextLine();
        
        System.out.println("Ingrese la medida del segundo cateto ->> ");
        cateto2 = scan.nextDouble();
        
    }
    
    public static void calcularHipotenusa(){
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("La hipotenusa del triángulo mide ->> " + hipotenusa);
    }
}
