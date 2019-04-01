package tp1;

import java.util.Scanner;

public class Ej11 {
	public static void menu(Scanner scan) {
		System.out.println("Ejercicio nº11: Realizar un programa que le pregunte al usuario que área\r\n" + 
				"desea calcular. Las opciones son: rectángulo, cuadrado, triangulo y circulo.\r\n");
		double base,altura,radio,resultado;
		int eleccion;
		do{
			System.out.println("Elija el area a obtener :" + "\r\n"+ "1.Rectangulo"+ "\r\n"
					 +"2.Cuadrado"+ "\r\n"+"3.Triangulo"+ "\r\n"+"4.Circulo"+ "\r\n" + "0 para salir"
					 + "\r\n");
			eleccion = Integer.parseInt(scan.next());
			switch(eleccion) {
			
			case 1:
				System.out.println("Ingrese el lado del cuadrado :" + "\r\n");
				base = Double.parseDouble(scan.next());
				resultado = areaCuadrado(base);
				System.out.println("El area del cuadrado es: "+ resultado + "\r\n");
				break;
				
			case 2:
				System.out.println("Ingrese la base del rectangulo :" + "\r\n");
				base = Double.parseDouble(scan.next());
				System.out.println("Ingrese la altura del rectangulo :" + "\r\n");
				altura = Double.parseDouble(scan.next());
				resultado = areaRectangulo(base,altura);
				System.out.println("El area del rectangulo es: "+ resultado + "\r\n");
				break;
				
			case 3:
				System.out.println("Ingrese la base del triangulo :"+ "\r\n");
				base = Double.parseDouble(scan.next());
				System.out.println("Ingrese la altura del triangulo :"+ "\r\n");
				altura = Double.parseDouble(scan.next());
				resultado = areaTriangulo(base,altura);
				System.out.println("El area del triangulo es: "+ resultado + "\r\n");
				break;
				
			case 4:
				System.out.println("Ingrese el radio del circulo :"+ "\r\n");
				radio = Double.parseDouble(scan.next());
				resultado = areaCirculo(radio);
				System.out.println("El area del circulo es: "+ resultado + "\r\n");
				break;
			
			}
		
		}while(eleccion != 0 );
		
	}
	public static double areaCuadrado (double lado) {
		double resultado = (lado * lado);
		return resultado;
	}
	
	public static double areaRectangulo(double base, double altura) {
		double resultado = (base * altura);
		return resultado;
	}
	
	public static double areaTriangulo (double base , double altura) {
		double resultado = (base * altura)/2;
		return resultado;
	}
	
	public static double areaCirculo (double radio) {
		double resultado = (Math.PI * (radio * radio));
		return resultado;
	}
}
