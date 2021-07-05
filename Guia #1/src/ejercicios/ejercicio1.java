package ejercicios;

import java.util.Scanner;

public class ejercicio1 {
	static Scanner scan;

	public static void promedio(int numeros[]) {
		int cantidad = 0, acumular = 0;
		cantidad = numeros.length;
		for (int i = 0; i < cantidad; i++) /// siendo la variable "i" = índice
		{
			acumular = acumular + numeros[i];
		}
		int rta = acumular / cantidad;
		System.out.println("El promedio es " + rta);
	}

	public static void promedioTeclado(int numeros[], int dimension) {
		scan = new Scanner(System.in);
		int posicion = 0;
		int numero = 0;
		char control = 's';

		do {

			System.out.println("Ingrese un numero por teclado ");
			numero = scan.nextInt();
			numeros[posicion] = numero;
			posicion++;
			System.out.println("Desea continuar?");
			control = scan.next().charAt(0);

		} while (control == 's' && posicion < dimension);
	}

}