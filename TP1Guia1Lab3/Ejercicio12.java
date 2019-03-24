package tp1.guia1;
import java.util.Scanner;

import static tp1.guia1.TP1Guia1.scan;

public class Ejercicio12 {
    public static void MuestraBuenosDias() {
        scan = new Scanner(System.in);
        String nombre = new String();
        System.out.println("ingrese nombre:");
        nombre = scan.nextLine();
        System.out.println("Buenos dias  "+nombre);
        scan.close();
    }
}
