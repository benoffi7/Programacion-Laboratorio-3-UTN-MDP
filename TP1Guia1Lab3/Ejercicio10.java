package tp1.guia1;

import java.util.Scanner;

import static tp1.guia1.TP1Guia1.scan;

public class Ejercicio10 {
    public static int Multiplicar(){
        int a =0;
        int b =0;
        int mult = 0;
        scan = new Scanner(System.in);
        System.out.println("Ingrese primer numero a multiplicar...");
        a = scan.nextInt();

        scan = new Scanner(System.in);
        System.out.println("Ingrese segundo numero a multiplicar...");
        b = scan.nextInt();

        mult = a * b;
        System.out.println("La multiplicacion es... " + mult );
        scan.close();
        return mult;


    }
}
