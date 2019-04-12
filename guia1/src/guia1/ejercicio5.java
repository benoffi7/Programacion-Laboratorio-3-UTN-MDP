package guia1;

import java.util.Scanner;

public class ejercicio5 {
	
	static Scanner scan;

	public static void mostrarPrimos()
	{
		int numero;
		String control = "s";
		scan = new Scanner (System.in);
		do 
		{
		System.out.print("ingrese numero: ");
		numero = scan.nextInt();
		  if(ejercicio3.esPrimo(numero))
		  {
			System.out.println("es primo");
		  }else {
			System.out.println("no es primo");  
		  }
		System.out.println("Desea Continuar s/n "); 
		control = scan.next();
		}while(control.equals("s"));
	}
}
