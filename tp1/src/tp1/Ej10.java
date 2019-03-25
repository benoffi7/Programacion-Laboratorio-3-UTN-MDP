package tp1;

import java.util.Scanner;

public class Ej10 {
	public static void menu(Scanner scan) {
		double primero, segundo;
		System.out.println("Ejercicio nº10: Multiplicar dos números.");
		System.out.println("Ingrese el primer numero : ");
		primero = Double.parseDouble(scan.next());
		System.out.println("Ingrese el segundo numero : ");
		segundo = Double.parseDouble(scan.next());
		try        
		{
			System.out.println("El resultado es : "+ multiplicar(primero,segundo));
		    Thread.sleep(3000);
		} 
		catch(InterruptedException ex) 
		{
		    Thread.currentThread().interrupt();
		}
	}
	public static double multiplicar(double primero, double segundo) {
		double multi;
		multi = primero * segundo;
		return multi;
	}
}
