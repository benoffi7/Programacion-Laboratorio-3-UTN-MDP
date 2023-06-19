package guia1;

import java.util.Scanner;

public class Ejercicio_2 
{
	public static void calcular_par_impar () 
	{
		Scanner scan= new Scanner (System.in);
		int num=0;
		System.out.println ("Ingrese un numero:"); //pido al usuario un numero
		int num = scan.nextInt();  //lo guardo en una variable
		scan.close();
		
		if (num%2 == 0) //el operador % devuelve el resto de una division, por lo cual si es 0 entonces confirmamos que es par
		{
			System.out.println ("El numero es par.");
		}
		else //de lo contrario, confirmamos que no es par
		{
			System.out.println ("El numero es impar.");
		}
	}
}
