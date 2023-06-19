package guia1;
import java.util.Scanner;
import java.lang.Math;

public class Ejercicio_20 
{
	public static void mostrar_random()
	{
		Scanner scan= new Scanner (System.in);
		int menor, mayor, random;
		
		System.out.println("Ingrese el numero menor:");
		int menor= scan.nextInt();
		System.out.println("Ingrese el numero mayor:");
		int mayor= scan.nextInt();
		scan.close();
		
		for (int i=0; i<10; i++)
		{
			random = Math.floor(Math.random()*(mayor-menor+1)+menor);
			System.out.println("Numero random " + i + ":" + random);
		}
	}
}
