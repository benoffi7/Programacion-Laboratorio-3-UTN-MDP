package guia1;

import java.util.Scanner;

public class Ejercicio10 {
	public static void encontrarASCII()
	{
		Scanner leer= new Scanner(System.in);
		System.out.println("ingresa un caracter\n");
		char caracter=leer.next().charAt(0);
		int caracterASCII= (int) caracter;
		System.out.println("El valor ASCII es "+caracterASCII+"\n");

	}
}
