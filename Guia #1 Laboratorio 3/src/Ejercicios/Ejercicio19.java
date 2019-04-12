package Ejercicios;

import java.util.Scanner;

public class Ejercicio19 {

	public static Scanner scan;
	
	public static void infomacionTemperaturas() {
		scan = new Scanner(System.in);
		float acumulador=0, promedio=0, maximo=0, minimo=0, temperatura=0;
		for(int i=0; i<30;i++) {
			System.out.println("Temperatura " + i + " de 30.");
			System.out.println("Ingrese la temperatura del día: ");
			temperatura=scan.nextFloat();
			acumulador+=temperatura;
			if(temperatura>maximo) {
				maximo=temperatura;
			}
			if(minimo==0) {
				minimo=temperatura;
			}
			if(temperatura<minimo) {
				minimo=temperatura;
			}
		}
		promedio=acumulador/30;
		System.out.println("El promedio de las temperaturas del mes es: " + promedio);
		System.out.println("La temperatura mínima de ese mes es: " + minimo);
		System.out.println("La temperatura máxima de ese mes es: " + maximo);
	}
}
