package tp1.guia1;

import java.util.Scanner;
import static tp1.guia1.TP1Guia1.scan;

public class Ejercicio8 {
    public static void AnoBisiesto(){
        int ano =0;
        scan = new Scanner(System.in);
        System.out.println("Ingrese año...");
        ano = scan.nextInt();

        if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0)))
            System.out.println("El año es bisiesto");
        else
            System.out.println("El año no es bisiesto");
        scan.close();
    }
}
