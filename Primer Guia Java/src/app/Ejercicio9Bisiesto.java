package app;
import java.util.Scanner;

public class Ejercicio9Bisiesto {
	
	static Scanner scan;
	
	public static void AnioBisiesto() {
		
		System.out.print("\n\nIngrese un anio: ");
		scan = new Scanner(System.in);
		int anio = scan.nextInt();
		
		if((anio %4==0 && anio%100!= 0) || (anio %400==0))
			System.out.print("El anio es bisiesto.");
		else
			System.out.print("El anio NO es bisiesto.");		
	}
}