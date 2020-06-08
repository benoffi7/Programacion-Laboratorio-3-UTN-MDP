package tareaxd;

import java.util.Scanner;

public class Ejercicio19 {
	public static Scanner scan;
	/*
	 * Ingresa un numero exacto de temperaturas y calcula promedio, tambien muestra
	 * el minimo y el maximo
	 * 
	 * Tambien pude haber puesto un contador en vez de pedir que se ingrese el
	 * numero de temperaturas
	 */

	public static void informacionTemperaturas() {
		scan = new Scanner(System.in);
		double prom = 0;
		int max = 0;
		int min = 0;
		int acumulador = 0;
		int i = 0;
		int num = 0;
		int aux = 0;
		System.out.println("Cuantas temperaturas desea ingresar?");
		num = scan.nextInt();
		while (i < num) {
			i++;
			System.out.println("Ingreso de temperaturas");
			System.out.println("Dia " + i + ":");
			aux = scan.nextInt();
			acumulador += aux;
			if (aux < min) {
				min = aux;
			}
			if (aux > max) {
				max = aux;
			}
		}
		prom = (double) acumulador / num;
		System.out.println(
				"Temperatura promedio: " + prom + ".  Temperatura maxima: " + max + ".  Temperatura minima: " + min);
	}
}
