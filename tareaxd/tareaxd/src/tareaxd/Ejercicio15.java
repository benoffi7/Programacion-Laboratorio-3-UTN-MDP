package tareaxd;

import java.util.Scanner;

public class Ejercicio15 {
	public static Scanner scan;

	public static double centigradosToFahr(int c) {
		return (double) 32 + (9 * c / 5);
	}

	public static void centigradosToFahrMuestra() {
		scan = new Scanner(System.in);
		int c = 0;
		double f = 0;
		System.out.println("Pasar grados centigrados a Fahrenheit. Ingrese la cantidad:");
		c = scan.nextInt();
		f = centigradosToFahr(c);
		System.out.println(c + " grados centigrados es " + f + " grados Fahrenheit");
	}

}
