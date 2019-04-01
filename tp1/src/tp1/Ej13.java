package tp1;

import java.util.Scanner;

public class Ej13 {
	public static void menu(Scanner scan) {
		System.out.println("Ejercicio nº13: Escribir un programa que lea un número entero por teclado y\r\n" + 
				"obtenga y muestre por pantalla el doble y el triple de ese número.");
		int entero;
		System.out.println("Ingrese un numero entero :");
		entero = Integer.parseInt(scan.next());
		dobleTriple(entero);
	}
	
	public static void dobleTriple (int entero) {
		try        
	{
		System.out.println("El doble : "+ entero*2);
		System.out.println("El triple : "+ entero*3);
	    Thread.sleep(3000);
	} 
	catch(InterruptedException ex) 
	{
	    Thread.currentThread().interrupt();
	}
		
	}
}
