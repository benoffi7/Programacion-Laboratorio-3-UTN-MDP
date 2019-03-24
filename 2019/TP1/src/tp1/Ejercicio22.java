package tp1;
import java.util.Scanner;
public class Ejercicio22 {
    static Scanner sc = new Scanner(System.in);
    public static void vigesimoSegundo(){
        int dato;
        do{
            System.out.println("Ingrese un numero entero positivo: ");
            dato = sc.nextInt();
        }while(dato<0);
        System.out.println("El numero "+dato+" tiene "+Integer.toString(dato).length()+" digitos.");
    }
}
