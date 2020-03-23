package guia1;

import java.util.Scanner;

public class Ejercicio12 {
	
	static Scanner scan;
	static double pi = 3.14;
	static double calcularArea;
	
	public static int Menu()
	{
		System.out.print("-------CALCULAR AREA----------\n");
		System.out.print("1- Calcular area de un circulo\n");
		System.out.print("2- Calcular area de un rectangulo\n");
		System.out.print("3- Calcular area de un cuadrado\n");
		System.out.print("4- Calcular area de un triangulo\n");
		
		int opcion;
		scan = new Scanner(System.in);
		System.out.print("- Ingrese una opcion: ");
		opcion = scan.nextInt();
		return opcion;
	}
	
	public static void resolucionEjer12()
	{
		scan = new Scanner(System.in);
		
		int opcion = Menu();
		switch(opcion)
		{
		case 1:
			double radio;
			System.out.print("Ingrese el radio: ");
			radio = scan.nextDouble();
			areaCirculo(radio);
			break;
		case 2:
			double baseR,alturaR;
			System.out.print("Ingrese el valor de la base: ");
			baseR = scan.nextDouble();
			System.out.print("Ingrese el valor de la altura: ");
			alturaR = scan.nextDouble();
			areaRectangulo(baseR,alturaR);
			break;
		case 3:
			double lado;
			System.out.print("Ingrese el valor del lado: ");
			lado = scan.nextDouble();
			areaCuadrado(lado);
			break;
		case 4:
			double baseT,alturaT;
			System.out.print("Ingrese el valor de la base: ");
			baseT = scan.nextDouble();
			System.out.print("Ingrese el valor de la altura: ");
			alturaT = scan.nextDouble();
			areaTriangulo(baseT,alturaT);
			break;
		default:
			System.out.print("opcion invalida");
		}
	}
	
	public static void areaCirculo(double radio)
	{
		calcularArea = pi * Math.pow(radio, 2);
		System.out.println("El area es de: "+calcularArea);
	}
	
	public static void areaRectangulo(double base,double altura)
	{
		calcularArea = base * altura;
		System.out.println("El area es de: "+calcularArea);
	}
	
	public static void areaCuadrado(double lado)
	{
		calcularArea = Math.pow(lado, 2);
		System.out.println("El area es de: "+calcularArea);
	}
	
	public static void areaTriangulo(double base,double altura)
	{
		calcularArea = base * altura / 2;
		System.out.println("El area es de: "+calcularArea);
	}

}
