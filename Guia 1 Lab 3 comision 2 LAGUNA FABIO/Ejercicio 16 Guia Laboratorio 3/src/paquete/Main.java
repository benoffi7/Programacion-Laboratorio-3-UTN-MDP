package paquete;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		iniciarCalculos ();
	}
	
	public static void iniciarCalculos () {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Radio:");
		float radio = scan.nextFloat();
		scan.close();
		
		float longitud = calcularLongitud (radio);
		float area = calcularArea (radio);
		
		System.out.println("Longitud de la circunferencia: " + longitud);
		System.out.println("Area de la circunferencia: " + area);
	}
	
	public static float calcularLongitud (float radio) {
		
		float longitud;
		longitud = 2*radio*(float)(Math.PI);
		
		return longitud;
	}
	
	public static float calcularArea (float radio) {
		
		float area;
		area = (float)(Math.PI)*(float)(Math.pow(radio, 2));
		
		return area;
	}

}
