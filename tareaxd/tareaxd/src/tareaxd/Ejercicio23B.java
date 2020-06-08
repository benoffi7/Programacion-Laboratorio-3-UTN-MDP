package tareaxd;

import java.util.Scanner;

public class Ejercicio23B {
	public static Scanner scan;

	public static void consultarSueldo() {
		scan = new Scanner(System.in);
		String nombre = " ";
		int edad = 0;
		double salario = 0;
		System.out.println("Ingrese nombre: ");
		nombre = scan.next();
		System.out.println("Ingrese edad: ");
		edad = scan.nextInt();
		System.out.println("Ingrese salario: ");
		salario = scan.nextDouble();
		if (edad < 16) {
			System.out.println(nombre + " no es apto para trabajar.");
		} else {		
			if (edad > 18 && edad < 51) {
				salario = salario * 1.05;
			}
			if (edad > 52 && edad < 61) {
				salario = salario * 1.1;
			}
			if (edad > 60) {
				salario = salario * 1.15;
			}
			System.out.println(nombre + " tiene un salario de " + salario + " pesos.");
		}
	}
}
