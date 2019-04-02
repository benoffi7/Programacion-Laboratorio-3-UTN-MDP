package app;
import java.util.Scanner;

public class Ejercicio20Naleatorios {
	
	static Scanner scan;
	
	public static void NumerosAleatorios() {
		
		scan = new Scanner(System.in);
		System.out.print("\nIngrese un valor: ");
		int num1= scan.nextInt(); 
		
		System.out.print("\nIngrese otro valor: ");
		int num2= scan.nextInt(); 
		
		System.out.print("\nvalor ingresado: "+num1);
		
		System.out.print("\nvalor ingresado: "+num2);
		
		int aleatorio, i;
		
		for(i=0; i<10; i++)
		{
			aleatorio= (int)Math.random()*100;
			System.out.print("\nvalor aleatorio: "+aleatorio);
		}		
	}
}
