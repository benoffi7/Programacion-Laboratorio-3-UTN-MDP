package ejercicios;

import java.math.*;

public class Ejercicio15 {
	public static void circunferenciaYRadio (double radio) {
		double longitud,area;
		longitud = 2*Math.PI*radio;
		area = Math.PI*(Math.pow(radio, 2));
		System.out.println("La circunferencia de radio: " + radio + " tiene una longitud de: " + longitud + " y un area de: " + area);
	}
}
