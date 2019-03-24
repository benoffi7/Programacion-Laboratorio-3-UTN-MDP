
package guia.uno;

import java.util.Scanner;


public class Ejercicio20 {
    private static Integer max = null;
    private static Integer min = null;
    private static Scanner scan = new Scanner(System.in);
    
    public static void pedirNumeros(){
        System.out.println("Ingrese el máximo ->> ");
        max = scan.nextInt();
        
        scan.nextLine();
        
        System.out.println("Ingrese el mínimo ->> ");
        min = scan.nextInt();
    }
    
    public static void generarAleatorios(){
        for(int i=0; i<10;i++){
            System.out.println("->> " +(int) ( (Math.random() * (max - min)) + min) );
        }
    }
}
