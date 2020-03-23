package guia1;

import java.util.Scanner;

public class Ejercicio20 {

	static Scanner scan;
	static int numeroMin;
	static int numeroMax;
	
	public static void resolucionEjer20()
	{
		scan = new Scanner(System.in);
		System.out.print("Numero menor: ");
		numeroMin = scan.nextInt();
		System.out.print("Numero mayor: ");
		numeroMax = scan.nextInt();
		randomNumber();
	}
	
	public static void randomNumber()
	{
		
		for(int i=0;i<10;i++)
		{
			int numero =(int) (Math.random() * (numeroMax - numeroMin) + numeroMin);
			System.out.print("\n"+numero);
		}
	}
}
