package Ejercicios;

public class Ejercicio22 {
	 
	public static int cantidadCifras(int numero) {
		int cifras=0;
		cifras = (int)(Math.log10(numero)+1);
		return cifras;
	}
}
