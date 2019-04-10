package tp1;
import java.util.Scanner;
public class Ejercicio14 {
    static Scanner sc = new Scanner(System.in);
    public static void catorceavo(){
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        System.out.println("Doble y triple del numero ingresado: "+ (num*2) + "-" + (num*3));
    }
}
