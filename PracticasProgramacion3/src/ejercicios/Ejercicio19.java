package ejercicios;

import java.math.*;

public class Ejercicio19 {
	public static void alabadoSeaElRNG (int min, int max) {
		double numeros[] = new double [10];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]= Math.random() * (max-min) + min;
			System.out.println(String.format("%.0f", numeros[i])+"|");
		}
	}
}
