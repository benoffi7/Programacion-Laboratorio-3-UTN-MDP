
package guia.uno;

import java.util.Scanner;


public class Ejercicio8 {
    
    private static Integer num = null;
    private static Scanner scan = new Scanner(System.in); 
    
    public static void contarPositivos(){
        String opcion = " ";
        int i = 0;
        do {
            System.out.println("Ingrese un número");
            num = scan.nextInt();
            
            if(num > 0){
                i++;
            }
            
            scan.nextLine();
            System.out.println("¿Desea seguir? (s/n)");
            opcion = scan.nextLine();
            
        } while (opcion.equals("s"));
        
        System.out.println("Ha ingresado " + i + " números positivos");
    }
}
