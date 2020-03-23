package guia1;

import java.util.Scanner;

public class Ejercicio22 {

	static Scanner scan;
	static int numero;
	static int digitos;
	
	public static void resolucionEjer22()
	{
		scan = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		numero = scan.nextInt();
		digitos = Integer.toString(numero).length();
		System.out.println("El número " + numero + " tiene " + digitos + " dígitos");	
	}
}
