package ejercicios;

import java.util.Scanner;

public class ejercicio6 {
	
	static Scanner scan;
	
	public static void ingresoPrimo()
	{	scan = new Scanner(System.in);
		char control;
		do
			{

		int numero=0;
		System.out.println("ingrese un numero primo ");
		numero=scan.nextInt();
		revisarPrimo(numero);
		System.out.println("Desea continuar?");
		control = scan.next().charAt(0);
			}
	while (control=='s');
		
	}

	public static void revisarPrimo(int numero)
	{
		int comparador, div=0;			/// div es la cantidad de veces que dara resto 0
	
	    for (comparador=1; comparador<=numero; comparador++)
			{
				if (numero%comparador == 0)
				{
					div++;
				}
			}
	    if (div==2)
		{
			System.out.println(numero+" es primo");
		}
	    else
	    {
	    	System.out.println(numero+" NO es primo");
	    }
	}
}
