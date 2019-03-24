package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static Scanner scan;

	public static void menuCalcularAreas(int opcion) {
		
		scan = new Scanner(System.in);
		float num1=0, num2=0, rta=0;
		switch (opcion) 
		{
		
		case 1:
			System.out.println("Ingrese la base del rectángulo en centímetros: ");
			num1=scan.nextFloat();
			System.out.println("Ingrese la altura del rectángulo en centímetros: ");
			num2=scan.nextFloat();
			rta=areaRectangulo(num1,num2);
			System.out.println("El área del rectángulo es " + rta + " centímetros cuadrados.");
			break;
			
		case 2:
			System.out.println("Ingrese el lado del cuadrado en centímetros: ");
			num1=scan.nextFloat();
			rta=areaCuadrado(num1);
			System.out.println("El área del cuadrado es " + rta + " centímetros cuadrados.");
			break;
			
		case 3:
			System.out.println("Ingrese la base del triángulo en centímetros: ");
			num1=scan.nextFloat();
			System.out.println("Ingrese la altura del triángulo en centímetros: ");
			num2=scan.nextFloat();
			rta=areaTriangulo(num1,num2);
			System.out.println("El área del triángulo es " + rta + " centímetros cuadrados.");
			break;
			
		case 4:
			System.out.println("Ingrese el radio del círculo en centímetros: ");
			num1=scan.nextFloat();
			rta=areaCirculo(num1);
			System.out.println("El área del círculo es " + rta + " centímetros cuadrados.");
			break;
		}
	}

	public static float areaRectangulo(float num1, float num2) {
		float rta = 0;
		rta = num1 * num2;
		return rta;
	}

	public static float areaTriangulo(float num1, float num2) {
		float rta = 0;
		rta = num1 * num2;
		return rta;
	}

	public static float areaCirculo(float num1) {
		float rta = 0;
		rta = (float) (Math.PI * (Math.pow(num1, 2)));
		return rta;
	}

	public static float areaCuadrado(float num1) {
		float rta = 0;
		rta = (float) (Math.pow(num1, 2));
		return rta;
	}
}
