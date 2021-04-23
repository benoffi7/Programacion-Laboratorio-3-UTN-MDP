package guia1;

import java.util.Scanner;

public class Ejercicio15 {
	public static void calcularGrados()
	{
		float F=0;
		float C=0;
		Scanner leer= new Scanner(System.in);
		System.out.println("Ingrese los grados centrigrados");
		C=leer.nextFloat();
		F = 32 + ( 9 * C / 5);
		System.out.println("Los grados fahrenheit son"+F);
	}
}
