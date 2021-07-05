package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
	static Scanner scan;
	public static void leerNombre()
	{
		String nombre;
		scan = new Scanner(System.in);
		System.out.println("Hola, como te llamas?");
		nombre=scan.nextLine();
		System.out.println("Hola "+nombre+"!!");
}
}