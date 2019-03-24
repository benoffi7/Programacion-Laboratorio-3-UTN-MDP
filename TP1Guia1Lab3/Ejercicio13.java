package tp1.guia1;
import java.util.Scanner;

import static tp1.guia1.TP1Guia1.scan;

public class Ejercicio13 {
    public static void MuestraDobleYTriple() {
        scan = new Scanner(System.in);
        System.out.println("ingrese numero:");

        int numero1 = scan.nextInt();
        int numero2 = 0;
        int numero3 = 0;

        numero2 = numero1 * 2;
        numero3 = numero1 * 3;

        System.out.println("numero multiplicado por dos:"+numero2);

        System.out.println("numero multiplicado por tres:"+numero3);

        scan.close();
    }
}
