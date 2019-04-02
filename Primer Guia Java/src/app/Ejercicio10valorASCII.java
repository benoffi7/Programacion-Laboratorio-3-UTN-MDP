package app;
import java.util.Scanner;
public class Ejercicio10valorASCII {
	
	static Scanner scan;
	
	public static void ASCIIdelCaracter()
	{
		System.out.print("\n\nIngrese un caracter: ");
		scan = new Scanner(System.in);
		/// char letra = 'a'; /// asi se define un caracter por defecto
		
		char letra;
		letra= scan.next().charAt(0);		
		System.out.print("El caracter ingresado tiene el valor ASCII: ");
		System.out.print((int)letra);
	}
}