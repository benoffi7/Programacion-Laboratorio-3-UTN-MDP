package paquete;

import java.util.Scanner;

public class Main {
		// SI HAGO scan.close() EN CADA FUNCION NO ME ANDA EL PROGRAMA Y NO SE PORQUE. SE CRASHEA CON EL SCAN.CLOSE
	public static float areaRectangulo ()
	{
		Scanner scan = new Scanner (System.in);
		System.out.print("Ingrese cuanto mide la base del rectángulo: ");
		float base = scan.nextFloat();
		System.out.print("Ingrese cuanto mide la altura del rectángulo: ");
		float altura = scan.nextFloat();
		float area = base * altura;
		//scan.close();
		return area;
	}
	public static float areaCuadrado ()
	{
		Scanner scan = new Scanner (System.in);
		System.out.print("Ingrese cuanto mide un lado del cuadrado: ");
		float lado = scan.nextFloat();
		float area = lado * lado;
		//scan.close();
		return area;
	}
	public static float areaTriangulo ()
	{
		Scanner scan = new Scanner (System.in);
		System.out.print("Ingrese cuanto mide la base del triangulo: ");
		float base = scan.nextFloat();
		System.out.print("Ingrese cuanto mide la altura del triangulo: ");
		float altura = scan.nextFloat();
		float area = (base * altura) / 2;
		//scan.close();
		return area;
	}
	public static float areaCirculo ()
	{
		Scanner scan = new Scanner (System.in);
		System.out.print("Ingrese el radio del circulo: ");
		float radio = scan.nextFloat();
		float area = (float) Math.PI * (radio*radio);
		//scan.close();
		return area;
	}
	
	public static void calcularArea ()
	{
		int num = -1;
		Scanner scan = new Scanner (System.in); 
		System.out.print("Ingrese la unidad de medicion (Cada medida tiene que estar en la misma unidad para efectuar el correcto calculo): ");
		String medida = scan.next();
		while (num!=0)
		{
			System.out.println(" ");
			System.out.println("1. Calcular area rectangulo");
			System.out.println("2. Calcular area cuadrado");
			System.out.println("3. Calcular area triangulo");
			System.out.println("4. Calcular area circulo");
			System.out.println("0. Salir");
			System.out.println(" ");
			System.out.print("Escoja una opcion: ");
			num = scan.nextInt();
			System.out.println(" "); //No se como hacer el system (cls), vi algo en internet pero como que hay que tocar algo del sistema y me da cosa
			switch (num)
			{
				case 0:
					break;
				case 1:
					System.out.println("El resultado es: " + areaRectangulo() + " " + medida +"²" );
					break;
				case 2:
					System.out.println("El resultado es: " + areaCuadrado() + " " + medida +"²" );
					break;
				case 3:
					System.out.println("El resultado es: " + areaTriangulo() + " " + medida +"²" );
					break;
				case 4:
					System.out.println("El resultado es: " + areaCirculo() + " " + medida +"²" );
					break;
				default:
					System.out.println("Opción incorrecta.");
					break;
			}
		}
		scan.close();
	}
	public static void main(String[] args) {
		calcularArea();
	}

}
