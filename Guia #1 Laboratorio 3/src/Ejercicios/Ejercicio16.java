package Ejercicios;

public class Ejercicio16 {

	public static float perimetroCirculo (float num1) {
		float perimetro=0;
		perimetro= (float) (2 * Math.PI * num1);
		return perimetro;
	}
	
	public static float areaCirculo(float num1) {
		float area = 0;
		area = (float) (Math.PI * (Math.pow(num1, 2)));
		return area;
	}
}
