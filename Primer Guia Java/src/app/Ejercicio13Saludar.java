package app;
import java.util.Scanner;

public class Ejercicio13Saludar {
	
	static Scanner scan;
	
	public static void Saludar()
	{
		scan = new Scanner(System.in);
		//scan = new Scanner(System.in);
		System.out.print("\n\nIngrese su nombre: ");
		String nombre =  scan.nextLine();
		System.out.print("Buenos dias "+nombre +" ! ");		
	}
}
