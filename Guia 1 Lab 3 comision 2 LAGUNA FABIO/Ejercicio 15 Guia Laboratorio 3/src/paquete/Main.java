package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Grados centigrados:");
		float centi = scan.nextFloat();
		scan.close();
		
		float fahre = pasarFahrenheit (centi);
		
		System.out.println("Grados fahrenheit: " + fahre);
	}
	
	public static float pasarFahrenheit (float centi) {
		
		float fahre;
		fahre = 32+(centi*9/5);
		
		return fahre;
	}

}
