package tp1;

import java.util.Scanner;

public class Ej21 {
	public static void menu(Scanner scan) {
		System.out.println("Ejercicio nº21: Pide por teclado un número entero positivo (debemos\r\n" + 
				"controlarlo) y muestra el número de cifras que tiene. Por ejemplo: si\r\n" + 
				"introducimos 1250, nos muestre que tiene 4 cifras. Tendremos que controlar\r\n" + 
				"si tiene una o más cifras, al mostrar el mensaje.");
		int entero = 1;
		int cifra = 0;
		while(entero >0 || entero == -99) {
			System.out.println("Ingresar un entero positivo (ingresa -99 si quieres salir");
			entero = Integer.parseInt(scan.next());
			if(entero >0)
			{
				cifra = cifras(entero);
				System.out.println("El entero "+ entero +" tiene "+ cifra +" cifras");
				
			}
			else if (entero != -99)
			{
				System.out.println("Ingresa un numero POSITIVO");
				entero = 1;
			}
		}
		
	}
	
	public static int cifras(int entero) {
		int resultado = (int)(Math.log10(entero)+1);
		return resultado;
	}
}
