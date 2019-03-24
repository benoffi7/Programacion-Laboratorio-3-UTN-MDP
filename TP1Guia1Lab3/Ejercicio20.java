package tp1.guia1;

import java.util.Scanner;

import static tp1.guia1.TP1Guia1.scan;

public class Ejercicio20 {
    public static void SeTrabaja() {
        int opcion = 0;
        do {
            System.out.println("Ingrese un dia...");
            System.out.println("1.Lunes | 2.Martes | 3.Miercoles | 4.Jueves | 5.Viernes | 6.Sabado | 7.Domingo");
            scan = new Scanner(System.in);
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("LUNES");
                    System.out.println("Es dia laboral...");
                    break;
                case 2:
                    System.out.println("MARTES");
                    System.out.println("Es dia laboral...");
                    break;

                case 3:
                    System.out.println("MIERCOLES");
                    System.out.println("Es dia laboral...");
                    break;

                case 4:
                    System.out.println("JUEVES");
                    System.out.println("Es dia laboral...");
                    break;

                case 5:
                    System.out.println("VIERNES");
                    System.out.println("Es dia laboral...");
                    break;
                case 6:
                    System.out.println("SABADO");
                    System.out.println("No es dia laboral...");
                    break;
                case 7:
                    System.out.println("DOMINGO");
                    System.out.println("No es dia laboral...");
                    break;
                case 8:
                    break;
            }
        }while (opcion < 8) ;
    }
}