package guia1;

import java.util.Scanner;

public class ejercicio10 {
	
	static Scanner scan;
	
	public static void valorAsciiCaracter()
	{
	    char caracter;
		scan = new Scanner(System.in);
		System.out.println("Ingrese un caracter: ");
		caracter = scan.next().charAt(0);
		
		int asciiCaracter =(int) caracter;
		System.out.println("Su Codigo ASCII es: "+asciiCaracter);
	}
	

}
