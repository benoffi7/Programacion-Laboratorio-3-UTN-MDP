package tp1;

import java.util.Scanner;

public class Ej16 {
	public static void menu(Scanner scan) {
		System.out.println("Ejercicio nº16: Programa que pase una velocidad en Km/h a m/s. La\r\n" + 
				"velocidad se lee por teclado.");
		double km,ms;
		System.out.println("Ingresar KM/H: ");
		km = Double.parseDouble(scan.next());
		ms = conversion(km);
		try 
		{
			System.out.println("Los "+km+"KM/H"+" son "+ms+"M/S");
			Thread.sleep(3000);
		} 
		catch(InterruptedException ex) 
		{
			Thread.currentThread().interrupt();
		}
		
	}
	public static double conversion (double km) {
		double ms = (km*1000)/3600;
		return ms;
	}
}
