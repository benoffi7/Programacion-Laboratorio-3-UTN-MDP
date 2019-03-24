package tareaxd;

import java.util.Scanner;

public class Ejercicio20 {
	public static Scanner scan;

	public static void numsRandomEntreXY(int cantidadNumeros) {
		scan = new Scanner(System.in);
		int min = 0;
		int max = 0;
		int aux = 0;
		System.out.println(
				"Ingrese 2 numeros, se mostraran " + cantidadNumeros + " numeros aleatorios que esten entre ellos.");
		System.out.println("Ingrese el primer numero: ");
		min = scan.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		max = scan.nextInt();
		if (min > max) { // Por si ponen los numeros al revez
			aux = min;
			min = max;
			max = aux;
		}
		System.out.println(cantidadNumeros + " numeros aleatorios entre " + min + " y " + max);
		for (int i = 0; i < cantidadNumeros; i++) {
			/*
			 * math.random devuelve un numero entre 0 y 1, con unas multiplicaciones y suma
			 * podemos "manipular" este numero para que nos de lo que deseamos, en este
			 * caso, numeros aleatorios entre 2 numeros
			 */
			System.out.println((int) (Math.random() * (max - min)) + min + 1);
		}
	}
}
