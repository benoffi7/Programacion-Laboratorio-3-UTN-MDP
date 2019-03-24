package tp1.guia1;

import java.util.Scanner;
import static tp1.guia1.TP1Guia1.scan;

public class Ejercicio19 {
    public static void Random() {

        double numA = 0;
        double numB = 0;
        double random = 0;
        int i = 0;

        System.out.println("Ingrese parametros para randomisar...");
        System.out.println("Ingrese un numero inicio...");
        scan = new Scanner(System.in);
        numA = scan.nextInt();
        System.out.println("Ingrese parametros para randomisar...");
        System.out.println("Ingrese un numero fin...");
        scan = new Scanner(System.in);
        numB = scan.nextInt();

        while (i < 10) {
            random = (double) (Math.random() * (numA-numB) + numB );;
            System.out.println("Numero aleatorio..." + random);
            i++;
        }
    }
}
