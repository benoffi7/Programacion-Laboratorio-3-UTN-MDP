package tareaxd;

import java.util.Scanner;

public class Ejercicio7 {
	public static Scanner scan;

	// Suma todos los naturales desde 0 hasta X numero, y devuelve el resultado
	public static int sumaNatDesdeN(int n) {
		return n * (n + 1) / 2; // suma aritmetica de Gauss
	}

	public static void sumaNatDesdeNMuestra() {
		scan = new Scanner(System.in);
		boolean flag = true;
		int num = 0;
		int suma = 0;
		while (flag == true) {
			System.out.println("Ingrese un numero natural para conocer su suma con todos sus anteriores");
			num = scan.nextInt();
			if (num < 1) {
				System.out.println("Los numeros naturales son los enteros positivos.");
			} else {
				flag = false;
			}
		}
		suma = sumaNatDesdeN(num);
		System.out.println("El resultado de sumar todos los numeros entre 0 y " + num + " es: " + suma);
	}
}
