package guia.uno;

import java.util.Scanner;

public class Ejercicio24 {

    private static Scanner scan = new Scanner(System.in);
    private static String nombre = " ";
    private static Integer edad = null;
    private static Float salario = null;
    private static Float salarioFinal = null;

    public static void pedirEdad() {
        do {
            System.out.println("Ingrese su edad");
            edad = scan.nextInt();
        } while (edad <= 0);
    }

    public static void pedirNombre() {
        System.out.println("Ingrese su nombre");
        scan.nextLine();
        nombre = scan.nextLine();
    }

    public static void pedirSalario() {
        System.out.println("Ingrese su salario");

        salario = scan.nextFloat();
    }

    public static void calcularSalario() {
        if (edad < 16) {
            System.out.println("No posee edad para trabajar");
            salarioFinal = (float) 0;
        } else if (edad >= 16 && edad <= 18) {
            salarioFinal = salario;
        } else if (edad >= 19 && edad <= 50) {
            salarioFinal = salario + (float) (salario * 0.05);
        } else if (edad > 50 && edad <= 60) {
            salarioFinal = salario + (float) (salario * 0.1);
        } else if (edad > 60) {
            salarioFinal = salario + (float) (salario * 0.15);
        }

        System.out.println("El salario final del trabajador " + nombre + " es ->> " + salarioFinal);
    }
}
