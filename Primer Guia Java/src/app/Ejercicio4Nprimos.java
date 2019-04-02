package app;
import java.util.Scanner;

public class Ejercicio4Nprimos {
	
	static Scanner scan;
	
	public static void Nprimitos()
	{
		scan = new Scanner(System.in);
		System.out.print("\n\nIngrese un numero: ");
		int num2, i=0;
		int num = scan.nextInt();	
		
		for(i=0; i<= num; i++)
		{
			num2= num-1;
			while((num%num2)!=0)/// esto va bien
			{
				num2--;			
			}
			
			if(num2 == 1)/// esto va bien
				System.out.print("\nEl numero: "+num +" es primo.");
		}
		
		System.out.print("\nSe mostraron los numeros primos de los primeros "+num +" numeros.");	
	}
}
