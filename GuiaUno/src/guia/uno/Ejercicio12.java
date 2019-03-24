package guia.uno;

import java.util.Scanner;

public class Ejercicio12 {

    private static Integer opcion = null;
    private static Scanner scan = new Scanner(System.in);

    public static void mostrarOpciones() {
        System.out.println("1  Rectángulo\n2 Triángulo\n3 Círculo\n4 Cuadrado");
        opcion = scan.nextInt();
/*
        switch (opcion) {
            case 1:
                System.out.println("rec");
                break;
            case 2:
                System.out.println("tria");
                break;
            case 3:
                System.out.println(
                "circ");
                break;
            case 4:
                System.out.println("cua");
                break;
        }*/
    }

}
