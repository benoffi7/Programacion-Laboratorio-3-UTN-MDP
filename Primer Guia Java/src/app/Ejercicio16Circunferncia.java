package app;
import java.util.Scanner;

public class Ejercicio16Circunferncia {
	
	static Scanner scan;
	double pi= 3.14f;
	
	public static void Circunferencia() {
	
		double radio, area, longitud;
		scan = new Scanner(System.in);
		
		System.out.print("\nIngrese el radio del circulo: ");
		radio = scan.nextDouble();
		
		area = Math.PI * Math.pow(2, radio);
		
		longitud = 2* Math.PI* radio;
		
		System.out.print("\n\nEl area del circulo es: "+area);
		System.out.print("\n\nLa longitud de la circunferencia es: "+longitud);		
	}
}
