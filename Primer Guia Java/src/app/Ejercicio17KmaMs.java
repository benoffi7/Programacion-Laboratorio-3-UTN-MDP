package app;
import java.util.Scanner;

public class Ejercicio17KmaMs {

	static Scanner scan;
	
	public static void KmaMs() {
	
		scan = new Scanner(System.in);
		System.out.print("\nIngrese KM: ");
		float kmh = scan.nextFloat();
		float ms= kmh * 5/18;		
		System.out.println("KM: "+kmh +" equibale a: "+ms);
	}	
}
