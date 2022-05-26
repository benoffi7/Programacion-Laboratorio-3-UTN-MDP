package tp1.guia1;

import java.util.Scanner;
import static tp1.guia1.TP1Guia1.scan;

public class Ejercicio21 {
    public static void Digitos(){
         int numero=0;
         int digitos=0;

         System.out.println("Cargue un numero positivo...");
         scan = new Scanner(System.in);
         numero = scan.nextInt();

         while(numero < 0){
             System.out.println("El numero no es positivo, carguelo de nuevo...");
             scan = new Scanner(System.in);
             numero = scan.nextInt();
         }
        digitos = (int) (Math.log10(numero)+1);
        System.out.println("El numero es..." + numero + "su cantidad de digitos..." + digitos);
    }
}
