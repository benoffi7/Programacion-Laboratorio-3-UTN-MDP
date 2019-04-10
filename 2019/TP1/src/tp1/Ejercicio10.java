package tp1;
import java.util.Scanner;
public class Ejercicio10 {
    static Scanner sc = new Scanner(System.in);
    public static void decimo(){
        System.out.println("Ingrese una letra y se mostrará el código ASCII de la misma: ");
        char letra = sc.next().charAt(0);
        int ascii = letra;
        System.out.println("ASCII: "+ascii);
    }
}
