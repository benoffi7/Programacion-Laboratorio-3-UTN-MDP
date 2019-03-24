package paquete;

import java.util.Scanner;

public class Main {

	public static int suma (int num1, int num2)
	{
		int suma = num1 + num2;
		return suma;
	}
	public static int resta (int num1, int num2)
	{
		int resta = num1 - num2;
		return resta;
	}
	public static int multiplicacion (int num1, int num2)
	{
		int multiplicacion = num1 * num2;
		return multiplicacion;
	}
	public static float division (int num1, int num2)
	{
		float division = num1 / num2;
		return division;
	}
	public static int potencia (int num1, int num2)
	{
		int potencia = (int) Math.pow(num1, num2);
		return potencia;
	}
	public static int modulo (int num1, int num2)
	{
		int modulo = num1 % num2;
		return modulo;
	}
	/*public static int valorASCII ()
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingrese el caracter que quiere conocer el valor: ");
		int valorAscii = scan.next().charAt(0);
		scan.close();
		return valorAscii;
	}*/
	
	public static void CalculadoraPolacaInversaApp ()
	{
		Scanner scan = new Scanner (System.in);
		int valorAscii = -1;
		
		System.out.println("CalculadoraPolacaInversaApp");
		System.out.println();
		System.out.print("Ingrese el primer operando: ");
		
		int num1 = scan.nextInt();
		
		System.out.print("Ingrese el segundo operando: ");
		
		int num2 = scan.nextInt();
		
		System.out.println();
		
		while (valorAscii != 83)
		{
			// podria hacer cambiar de operandos tambien
			System.out.println("+: Suma los dos operandos");
			System.out.println("-: Resta los dos operandos");
			System.out.println("*: Multiplica los dos operandos");
			System.out.println("/: Dividie los dos operandos");
			System.out.println("^: Potencia, 1º operando como base y 2º como exponente");
			System.out.println("%: Modulo, resto de la division entre 1º operando y 2º operando");
			System.out.println("S: Salir");
			System.out.println();
			System.out.print("Escoja una opcion: ");
			
			valorAscii = scan.next().charAt(0);
			
			switch (valorAscii)
			{
			case 83:
				break;
			case 43:
				System.out.println("Suma: " + suma(num1, num2));
				System.out.println();
				break;
			case 45:
				System.out.println("Resta: " + resta(num1, num2));
				System.out.println();
				break;
			case 42:
				System.out.println("Multiplicacion: " + multiplicacion(num1, num2));
				System.out.println();
				break;
			case 47:
				System.out.println("Division: " + division(num1, num2));
				System.out.println();
				break;
			case 94:
				System.out.println("Potencia: " + potencia(num1, num2));
				System.out.println();
				break;
			case 37:
				System.out.println("Modulo: " + modulo(num1, num2));
				System.out.println();
				break;
			default:
				System.out.println("Opcion incorrecta.");
				System.out.println();
			}
		}
		scan.close();
	}
	public static void main(String[] args) {
		CalculadoraPolacaInversaApp();
	}

}
