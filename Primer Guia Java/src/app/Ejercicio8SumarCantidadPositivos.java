package app;
import java.util.Scanner;

public class Ejercicio8SumarCantidadPositivos {
	
	static Scanner scan;
	
	public static void SumarContarPositivo() {
		
		scan = new Scanner(System.in);
		char control ='s';
		int num, positivos=0;		
		
		while(control =='s')
		{
			System.out.print("\n<> Digite un numero: ");
			num = scan.next().charAt(0);
			
			if(num > 0)
				positivos++;
			
			System.out.print("Queres ingresar mas numeros? --> ");
			control = scan.next().charAt(0);
		}
		System.out.print("\nSe ingreso numeros "+positivos +" positivos.");
	}
}
