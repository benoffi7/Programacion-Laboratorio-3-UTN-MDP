package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese velocidad");
		float velocidadKm = scan.nextFloat();
		scan.close();
		System.out.println(velocidadKm + " Km/h");
		
		float velocidadMs = pasarKmMs (velocidadKm);
		
		System.out.println(velocidadMs + " m/s");
	}
	
	public static float pasarKmMs (float velocidadKm) {
		
		float velocidadMs;
		
		velocidadMs = velocidadKm*5/18;
		
		return velocidadMs;
	}

}
