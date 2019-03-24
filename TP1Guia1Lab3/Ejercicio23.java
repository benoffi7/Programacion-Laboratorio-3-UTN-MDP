package tp1.guia1;

import java.util.Scanner;

import static tp1.guia1.TP1Guia1.scan;

public class Ejercicio23 {
    public static void Trabajador(){
        String nombre = new String();
        int edad =0;
        double salario =0;
        double total =0;

        System.out.println("Ingrese sus datos...");

        System.out.println("Nombre...");
        scan = new Scanner(System.in);
        nombre = scan.next();

        System.out.println("Edad...");
        scan = new Scanner(System.in);
        edad = scan.nextInt();

        if (edad<16){
            System.out.println("No puede trabajar...");
        }

        if(edad>16){
            System.out.println("Salario...");
            scan = new Scanner(System.in);
            salario = scan.nextDouble();
            if(edad> 16 && edad< 19){
                total = salario;
                System.out.println("El salario es..." + total);
            }
            if((edad >= 19) && (edad < 50)){
                total = salario + (salario * 0.05);
                System.out.println("El salario es..." + total);
            }
            if((edad >= 50) && (edad < 60)){
                total = salario + (salario * 0.10);
                System.out.println("El salario es..." + total);
            }
            if(61<= edad){
                total = salario + (salario * 0.15);
                System.out.println("El salario es..." + total);
            }
        }

    }
}
