package guia1;

import java.util.Scanner;

public class Ejercicio14 {

	static Scanner scan;
	static int entero;
	
	public static void dobleTriple()
	{
		scan = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		entero = scan.nextInt();
		doble(entero);
		triple(entero);
		

	}
	
	public static void doble(int entero)
	{
       int doble = Math.multiplyExact(entero, 2);
       System.out.print("El doble es: "+doble+"\n");
	}
	
	public static void triple(int entero)
	{
       int triple = entero * 3;
       System.out.print("El triple es: "+triple+"\n");
	}
	
	
}
