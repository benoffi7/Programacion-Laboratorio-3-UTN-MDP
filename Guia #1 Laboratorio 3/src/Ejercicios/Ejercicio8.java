package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
	public static Scanner scan;

	public static int contadorPositivos(int contador) {
		scan = new Scanner(System.in);
		String control = new String("s");
		int numero;
		while (control.equals("s")) {
			System.out.println("Ingrese un numero");
			numero = scan.nextInt();
			if ((numero > 0) && (control.equals("s"))) {
				contador++;
			}
			System.out.println("Desea continuar? s/n");
			control = scan.next();
		}
		return contador;
	}
}
