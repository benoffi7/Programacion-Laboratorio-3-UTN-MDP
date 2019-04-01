package tp1;

import java.util.Scanner;

public class Ej1 {

	public static void menu(Scanner scan) {
		System.out.println("Ejercicio nº1: Calcular el promedio de un arreglo de números enteros."
				+ "Realizar variantes con arreglos ya inicializados e ingreso por teclado.");
		int[]  arreglo = new int[]{0,0,0,0,0};
		for(int i=0;i<5;i++) {
			System.out.println("Ingrese un numero posicion: " + (i +1) );
			arreglo[i] = Integer.parseInt(scan.next());
		}
		double promedio = promedio(arreglo);
		System.out.println("El Promedio es : " + promedio);
	}
	
	public static int sumar (int[] arreglo) {
		int total = 0;
		for(int i =0; i < arreglo.length;i++) {
			total += arreglo[i];
		}
		return total;
	}
	
	public static double promedio (int[] arreglo) {
		int total = sumar(arreglo);
	    double promedio = (double)total/arreglo.length;
	    return promedio;
		
		
	}
}
