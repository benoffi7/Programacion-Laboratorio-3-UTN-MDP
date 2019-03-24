package guia1;
import java.util.Scanner;


public class Ejercicio_14 
{
	public static void dobleYtriple ()
	{
		Scanner scan= new Scanner (System.in);
		int num, doble, triple;
		
		System.out.println("Ingrese un numero: ");
		int num= scan.nextInt();  
		scan.close();
		
		doble= num*num;
		triple=num*num*num;
		
		System.out.println("El doble de su numero es:" + doble);
		System.out.println("El triple de su numero es:" + triple);
	
	}
}
