package tp1;
import java.util.Scanner;
public class Ejercicio2 {
    static Scanner scan = new Scanner (System.in);
    public static void segundo(){
        System.out.println("Ingrese un numero: ");
        int i = scan.nextInt();
        if(i % 2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
}
