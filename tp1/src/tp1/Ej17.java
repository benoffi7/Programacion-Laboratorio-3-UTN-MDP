package tp1;

import java.util.Scanner;

public class Ej17 {
	public static void menu(Scanner scan) {
		System.out.println("Ejercicio nº17: Programa lea la longitud de los catetos de un triángulo\r\n" + 
				"rectángulo y calcule la longitud de la hipotenusa según el teorema de\r\n" + 
				"Pitágoras.\r\n");
		double ladoA, ladoB,hipotenusa;
		System.out.println("Ingresar el lado A: ");
		ladoA = Double.parseDouble(scan.next());
		System.out.println("Ingresar el lado B");
		ladoB = Double.parseDouble(scan.next());
		hipotenusa = sacaHipotenusa(ladoA,ladoB);
		try 
		{
			System.out.println("La hipotenusa es "+hipotenusa);
			Thread.sleep(3000);
		} 
		catch(InterruptedException ex) 
		{
			Thread.currentThread().interrupt();
		}
		
	}
	
	public static double sacaHipotenusa (double ladoA, double ladoB) {
		double hipotenusa = Math.sqrt( Math.pow(ladoA, 2)+ Math.pow(ladoB, 2));
		return hipotenusa;
	}
}
