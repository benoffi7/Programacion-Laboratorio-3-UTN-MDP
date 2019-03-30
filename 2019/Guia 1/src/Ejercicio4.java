import java.util.Scanner;

public class Ejercicio4 {

    public static void Menu(){

        int cant_primos=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros primos a mostrar: ");
        cant_primos=scan.nextInt();
        scan.close();
        Ejercicio3.Mostrar_cantidad_numeros_primos(cant_primos);


    }
}
