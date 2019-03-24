package tp1.guia1;

import java.util.Scanner;

import static java.lang.Math.PI;
import static tp1.guia1.TP1Guia1.scan;
import java.lang.Math;

public class Ejercicio15 {
    public static void LongYArea() {

        float num = 0;
        float area = 0;

        scan = new Scanner(System.in);
        System.out.println("ingrese Valor del Radio:");
        num = scan.nextFloat();

        float longitud = (float) (2 * (Math.PI*num));
        area = (float) (PI*(Math.pow(num, 2)));

        System.out.println("Longitud de la circunferencia: "+longitud);
        System.out.println("Area de la circunferencia: "+area);
        scan.close();
    }
}
