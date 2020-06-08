package tareaxd;

import java.util.Scanner;

public class Ejercicio12 {
	public static Scanner scan;

	public static double areaRectangulo(double lado1, double lado2) {
		return lado1 * lado2;
	}

	public static double areaCuadrado(double lado) {
		return lado * lado;
	}

	public static double areaTriangulo(double base, double altura) {
		return base * altura * 1 / 2;
	}

	public static double areaCirculo(double radio) {
		return Math.PI * radio * radio;
	}

	public static void menuAreas() {
		scan = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		double rta = 0;
		int opcion = 0;
		boolean flag = true;
		while (flag == true) {
			System.out.println("Calculo de areas de formas geometricas: ");
			System.out.println("Opcion 1: cuadrado");
			System.out.println("Opcion 2: rectangulo");
			System.out.println("Opcion 3: triangulo");
			System.out.println("Opcion 4: circulo");
			System.out.println("Opcion 5: Salir del menu");
			opcion = scan.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Ingrese el lado 1 del rectangulo en metros");
				num1 = scan.nextDouble();
				System.out.println("Ingrese el lado 2 del rectangulo en metros");
				num2 = scan.nextFloat();
				rta = areaRectangulo(num1, num2);
				System.out.println("El area del rectangulo es de " + rta + " metros cuadrados");
				flag = false;
				break;
			case 2:
				System.out.println("Ingrese el lado del cuadrado en metros");
				num1 = scan.nextDouble();
				rta = areaCuadrado(num1);
				System.out.println("El area del cuadrado es de " + rta + " metros cuadrados");
				flag = false;
				break;
			case 3:
				System.out.println("Ingrese la base del triangulo en metros");
				num1 = scan.nextDouble();
				System.out.println("Ingrese la altura del triangulo en metros");
				num2 = scan.nextDouble();
				rta = areaTriangulo(num1, num2);
				System.out.println("El area del triangulo es de " + rta + " metros cuadrados");
				flag = false;
				break;
			case 4:
				System.out.println("Ingrese el area del circulo en metros");
				num1 = scan.nextDouble();
				rta = areaCirculo(num1);
				System.out.println("El area del circulo es de " + rta + " metros cuadrados");
				flag = false;
				break;
			case 5:
				flag = false;
				break;
			default:
				System.out.println("Opcion incorrecta, intentelo nuevamente.");
				break;
			}
		}
	}
}