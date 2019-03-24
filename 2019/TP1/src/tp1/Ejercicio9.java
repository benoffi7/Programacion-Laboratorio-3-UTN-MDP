package tp1;
import java.util.Scanner;
public class Ejercicio9 {
    static Scanner sc = new Scanner(System.in);
    public static void noveno(){
        System.out.println("Ingrese un año y se comprobará si es bisiesto: ");
        int año = sc.nextInt();
        if(año % 4 == 0){
            System.out.println("El año ingresado es bisiesto.");
        }else{
            System.out.println("El año ingresado no es bisiesto.");
        }
    }
}
