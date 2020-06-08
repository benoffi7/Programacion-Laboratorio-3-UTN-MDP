package tareaxd;

import java.util.Scanner;

public class Ejercicio22 {
	public static Scanner scan;

	public static void cantidadCifras() {
		scan = new Scanner(System.in);
		int cifras = 0;
		int numero=0;
		do {
		System.out.println("Ingrese un numero entero positivo: ");
		 numero = scan.nextInt();
		}while(numero<1);//repite el bucle si el numero ingresado no es positivo (0 no es positivo)
		cifras = (int) (Math.log10(numero) + 1);
		if (cifras == 1) {
			System.out.println("El numero tiene una cifra.");
		} 
		else {
			System.out.println("El numero tiene " + cifras + " cifras.");
		}
	}
}
