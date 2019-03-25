package tp1;

import java.util.Scanner;

public class Ej12 {
	public static void menu (Scanner scan) {
		System.out.println("Ejercicio nº12: Programa que lea un nombre y muestre por pantalla:\r\n" + 
				"“Buenos dias nombre_introducid");
				try 
				{
					String nombre_introducid = "";
					System.out.println("Ingrese el nombre : " + "\r\n");
					nombre_introducid = scan.next();
					System.out.println("Buenos dias "+ nombre_introducid);

		    Thread.sleep(3000);
		} 
		catch(InterruptedException ex) 
		{
		    Thread.currentThread().interrupt();
		}
	}
}
