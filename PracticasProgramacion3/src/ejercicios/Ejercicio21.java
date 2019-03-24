package ejercicios;
import java.math.*;

public class Ejercicio21 {
	public static void cantidadDeSifras (int numero) {
		int cifras = (int)(Math.log10(numero)+1);
		System.out.println("El numero: "+numero+" tiene "+cifras+" cifras");
	}
}
