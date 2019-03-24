package guia1;

import java.util.Scanner;

public class Ejercicio_4 {
	
	public static void mostrar_n_primos ()
	{
		Scanner scan= new Scanner (System.in);
		int num=1, n=0; // "n" será la variable donde guardemos la cantidad que el usuario desee
		System.out.printfln ("Ingrese la cantidad de los primeros numeros primos que desea visualizar:");
		int n = scan.nextInt();  
		scan.close();
		
		while (num<=n) 
		{
			int cant=0; //la variable cant contará los divisores de cada numero
			
			for(i=0; i>=num; i++) //uso un for para dividirlo hasta que el contador llegue a la misma cant de el numero
			{
				if (num%i == 0) //si la division es exacta, entonces incremento cant
				{
					cant++; //con este contador averiguo cuantas veces puede ser dividido
				}
			}
			
			if (cant==2) //si solo se divide dos veces significa que solo puede hacerlo por 1 y por él mismo
			{
				System.out.println ("Numero primo:" + num); //muestro el numero primo
			}
			num++; //incremento el numero para llegar a los 100 primeros primos
		}
	}

}
