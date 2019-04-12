package guia1;

import java.util.Scanner;

public class Ejercicio17 {
	
	static Scanner scan;
	static int km;
	static int ms;

	public static void resolucionEjer17()
	{
		scan = new Scanner(System.in);
		System.out.print("ingresar kilometros: ");
		km = scan.nextInt();
		ms = km * 5/18;
		System.out.print("Metros por segundo: "+ms+" M/S");
	}
}
