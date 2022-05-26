package tp1.guia1;

import java.util.Scanner;
import static tp1.guia1.TP1Guia1.scan;

public class Ejercicio14 {
    public static void PasaCAF() {
        float farenheit = 0;
        scan = new Scanner(System.in);
        System.out.println("ingrese Grados Centigrados:");
        float grados = scan.nextFloat();
        farenheit = 32+ (9*grados/5);
        System.out.println("los Grados Farhenheit son:"+farenheit);
        scan.close();
    }
}
