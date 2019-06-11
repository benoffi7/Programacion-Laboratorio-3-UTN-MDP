package ejercicios;
import java.math.*;

public class Ejercicio17 {
	public static void calculoDeHipotenusa (double cateto1, double cateto2) {
		double hipotenusa= Math.sqrt(((Math.pow(cateto1, 2))+(Math.pow(cateto2, 2))));
		System.out.println("La longitud de la hipotenusa es: "+ String.format("%.2f", hipotenusa));
	}
}
