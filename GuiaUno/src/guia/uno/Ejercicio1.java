
package guia.uno;
import java.util.Scanner;

public class Ejercicio1 {
    
    private static int [] arreglo = new int[5];
    
    private static Scanner scan = new Scanner(System.in); 
    
    public static void setArregloAzar(){
        
        for(int i=0;i<arreglo.length;i++){
            arreglo[i] = (int) (Math.random() * 50);
        }
        
    }
    
    public static void setArregloUser(){
        String opcion = "s";
        
        for(int i=0; i<arreglo.length && opcion.equals("s"); i++){
            
            System.out.println("Número ->>     ");
            arreglo[i] = scan.nextInt();
            
            scan.nextLine(); //para que pueda leer la siguiente línea
            
            System.out.println("¿Desea seguir? (s/n)");
            opcion = scan.nextLine();

        }

    }
    
    public static void mostrarArreglo(){
        for(int i: arreglo){
            System.out.println("[ " + i + " ]");
        }
    }
    
    public static float getPromedio(){
        int suma = 0;
        int i;
        
        for(i=0;i<arreglo.length;i++){
            suma += arreglo[i];
        }
        
        return ((float)suma/(float)i);
    }
}
