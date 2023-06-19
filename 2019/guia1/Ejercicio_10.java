package guia1;

import java.util.Scanner;

public class Ejercicio_10 
{
	public static void valor_ascii ()
	{
		Scanner scan= new Scanner (System.in);
		char caracter;
		System.out.println("Ingrese el caracter que desea convertir:");
		char caracter = scan.next().charAt(0);
		scan.close();
		
		int asciiValue = (int) caracter;  //convertimos el caracter a entero
		System.out.println("El valor ascii del caracter es:" + caracter);  //mostramos su valor en ascii
	}
}
