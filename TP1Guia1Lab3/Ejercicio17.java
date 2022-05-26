package tp1.guia1;

import java.util.Scanner;

import static tp1.guia1.TP1Guia1.scan;

public class Ejercicio17 {
    public static void Pitagoras(){
        double a=0;
        double b=0;
        double h=0;
        double aux=0;

        System.out.println("Arme el triangulo...");
        System.out.println("Ingrese los catetos...");

        System.out.println("Cateto A...");
        scan = new Scanner(System.in);
        a= scan.nextFloat();

        System.out.println("Cateto B...");
        scan = new Scanner(System.in);
        b= scan.nextFloat();

        aux = (Math.pow(a,2) + Math.pow(b,2));
        h = Math.sqrt(aux);

        System.out.println("La hipotenusa es..." + h);

    }
}
