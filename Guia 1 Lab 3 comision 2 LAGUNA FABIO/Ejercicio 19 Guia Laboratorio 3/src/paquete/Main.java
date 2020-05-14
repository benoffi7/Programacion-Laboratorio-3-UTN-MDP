package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] temperaturas = new int[] {22,25,31,30,18,19,15,36,32,20,34,21,22,17,33,31,25,24,29,12,17,18,21,31,30,13,15,23,33,31};
		//Para no cargar 30 por teclado, declaro un arreglo ya inicializado con las 30 temperaturas
		//mostrarArreglo (temperaturas);
		iniciarCalculos (temperaturas);
	}
	
	
	public static void mostrarArreglo (int[] temperaturas) {
		
		int i;
		
		for (i=0 ; i<30 ; i++) {
			System.out.println(temperaturas[i]);
		}
	}
	
	public static void iniciarCalculos (int[] temperaturas) {
		
		int max = encontrarMax (temperaturas);
		int min = encontrarMin (temperaturas);
		float prom = promedio (temperaturas);
		
		System.out.println("La maxima temperatura es " + max);
		System.out.println("La minima temperatura es " + min);
		System.out.println("El promedio de las temperaturas es igual a " + prom);
	}
	
	public static int encontrarMax (int[] temperaturas) {
		
		int i, max=temperaturas[0];
		
		for (i=1 ; i<30 ; i++) {
			if (temperaturas[i]>max) {
				max = temperaturas[i];
			}
		}
		
		return max;
	}
	
	public static int encontrarMin (int[] temperaturas) {
		
		int i, min=temperaturas[0];
		
		for (i=1 ; i<30 ; i++) {
			if (temperaturas[i]<min) {
				min = temperaturas[i];
			}
		}
		
		return min;
	}
	
	public static float promedio (int[] temperaturas) {
		
		int i, suma=0;
		float prom;
		
		for (i=0 ; i<30 ; i++) {
			suma += temperaturas[i];
		}
		
		prom = (float)suma/30;
		
		return prom;
	}

}
