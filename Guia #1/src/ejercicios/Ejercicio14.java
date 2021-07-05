package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
	static Scanner scan;
	public static void duplicaYtriplica()
	{
		int numero;
		scan = new Scanner(System.in);
		System.out.println("ingrese un numero ... ");
		numero=scan.nextInt();
		System.out.println(numero*2);
		System.out.println(numero*3);		
}
}