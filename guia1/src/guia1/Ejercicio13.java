package guia1;

import java.util.Scanner;

public class Ejercicio13 {

	static Scanner scan;
	
	public static void resolucionEjer13()
	{
		scan = new Scanner(System.in);
		System.out.println("Ingrese un nombre: ");
		String nombre = scan.nextLine();
		System.out.println("Buenos dias "+nombre);
	}
}
