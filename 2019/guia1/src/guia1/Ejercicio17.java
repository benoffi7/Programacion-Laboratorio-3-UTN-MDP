package guia1;

import java.util.Scanner;

public class Ejercicio17 {
	public static void pasarDeKMaMS()
	{
		double KMH=0,MS=0;
		Scanner leer= new Scanner(System.in);
		System.out.println("Ingrese los KM/H");
		KMH=leer.nextDouble();
		MS=KMH/3.6;
		System.out.println("Son "+MS+"M/S");

	}
}
