package paquete;

import java.util.Scanner;

public class Main {

	public static int pedirNumeroPrimerosNumPrimos ()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de numeros primos que quiere mostrar a partir del primero:");
		int num = scan.nextInt();
		scan.close();
		return num;
	}
	public static boolean revisarSiEsPrimo (int num)
	{
		boolean control = false; 
		if (num>=1) 
		{							
			control = true; 		
			for (int i=2;i<num;i++)  
				if(num%i==0)		
					control = false;
		}
		return control;		
	}
	public static void mostrarPrimeros_n_NumerosPrimos (int cant)
	{
		int num=1;
		int i=0;
		System.out.println(" ");
		System.out.print("Cantidad de numeros primos a mostrar: " + cant + "\n");
		System.out.print("Numeros primos: \n");
		while (i!=cant)
		{
			if (revisarSiEsPrimo(num))
			{
				System.out.print(num+" ");
				i++;
			}			
		 	num++;
		}
	}
	
	public static void main(String[] args) {
		mostrarPrimeros_n_NumerosPrimos(pedirNumeroPrimerosNumPrimos());
	}
}
