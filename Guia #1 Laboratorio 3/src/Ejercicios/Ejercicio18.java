package Ejercicios;

public class Ejercicio18 {

	public static float calcularHipotenusa (float cateto1, float cateto2) {
		float hipotenusa=0;
		hipotenusa= (float) Math.sqrt((Math.pow(cateto1,2)+Math.pow(cateto2,2)));
		return hipotenusa;
	}
}