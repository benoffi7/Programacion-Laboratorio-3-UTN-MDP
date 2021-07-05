package ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
	static Scanner scan;
	public static void kmAmetros()
	{
		 scan = new Scanner(System.in);
		 double km, metros;
		 System.out.println("ingrese la velocidad en kilometros por hora ");
		 km=scan.nextDouble();
		 metros=km*5/18;
		System.out.println("la velocidad equivale a "+ metros +" por segundo");
}
}
