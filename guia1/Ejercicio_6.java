package guia1;

import java.util.Scanner;

public class Ejercicio_6 {

	
	public static void mostrar_primos ()
	{
		Scanner scan= new Scanner (System.in);
		int num; 
		char control = 's';
		
		do 
		{
			System.out.println ("Ingrese el numero a revisar:");
			int num = scan.nextInt(); 
			int cant=0; //la variable cant contará los divisores de cada numero
			
			
			
			//primero averiguo si es primo o no//
			
			for(i=0; i<=num; i++) //uso un for para dividirlo hasta que el contador llegue a la misma cant de el numero
			{
				if (num%i == 0) //si la division es exacta, entonces incremento cant
				{
					cant++; //con este contador averiguo cuantas veces puede ser dividido
				}
			}
			
			
			
			//luego informo al usuario//
			
			if (cant==2) //si solo se divide dos veces significa que solo puede hacerlo por 1 y por él mismo
			{
				System.out.println ("El numero es primo."); 
			}
			else
			{
				System.out.println ("El numero no es primo.");	
			}
			
			
			System.out.println ("Desea probar con otro numero? s/n"); 
			char control = scan.next().charAt(0);
	

		}
		while (control=='s');
		scan.close();
	}
}
