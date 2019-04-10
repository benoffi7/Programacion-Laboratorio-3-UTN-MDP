package tp1;
import java.util.Scanner;
public class Ejercicio1 {
    static Scanner scan = new Scanner (System.in);
    public static void primero(){
        int[] arreglo = new int[5];
        int suma = 0;
        for(int i = 0;i<arreglo.length;i++){
            System.out.println("Ingrese un numero: ");
            arreglo[i] = scan.nextInt();
            suma += arreglo[i];
        }
        int rta = suma / arreglo.length;
        System.out.println("El promedio de los numeros ingresados es: "+ rta); //PULL REQUEST HACER A BENOFFI
    }
}
