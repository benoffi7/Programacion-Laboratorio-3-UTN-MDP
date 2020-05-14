package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		iniciar ();
	}
	
	public static void iniciar () {
		
		float res;
		String control = "Si";
		String figura;
		Scanner scan = new Scanner(System.in);
		
		while (control.equalsIgnoreCase("Si")) {
			System.out.println("Ingrese la figura para calcular su area (rectangulo/cuadrado/triangulo/circulo)");
			figura = scan.next();
			if (figura.equalsIgnoreCase("rectangulo")) {	
				res = calcularAreaRectangulo ();
				System.out.println("El area del " + figura + " es igual a " + res);
			}else {
				if (figura.equalsIgnoreCase("cuadrado")) {
					res = calcularAreaCuadrado ();
					System.out.println("El area del " + figura + " es igual a " + res);
				}else {
					if (figura.equalsIgnoreCase("triangulo")) {
						res = calcularAreaTriangulo ();
						System.out.println("El area del " + figura + " es igual a " + res);
					}else {
						if (figura.equalsIgnoreCase("circulo")) {
							res = calcularAreaCirculo ();
							System.out.println("El area del " + figura + " es igual a " + res);
						}else {
							System.out.println("Opcion incorrecta");
						}
					}
				}
			}
			System.out.println("Desea calcular otra area? Ingrese 'Si'");
			control = scan.next();
		}
		scan.close();
	}
	
	public static float calcularAreaRectangulo () {
		
		float res;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Base:");
		float base = scan.nextFloat();
		
		System.out.println("Altura:");
		float altura = scan.nextFloat();	
		
		res = base*altura;
		
		return res;
	}
	
	public static float calcularAreaCuadrado () {
		
		float res;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lado:");
		float lado = scan.nextFloat();
		
		res = lado*lado;
		
		return res;
	}
	
	public static float calcularAreaTriangulo () {
		
		float res;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Base:");
		float base = scan.nextFloat();
		
		System.out.println("Altura:");
		float altura = scan.nextFloat();
		
		res = (base*altura)/2;
		
		return res;
	}
	
	public static float calcularAreaCirculo () {
		
		float res;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Radio:");
		float radio = scan.nextFloat();
		
		res = (radio*radio)*(float)3.1416;
		
		return res;
	}
	
}
