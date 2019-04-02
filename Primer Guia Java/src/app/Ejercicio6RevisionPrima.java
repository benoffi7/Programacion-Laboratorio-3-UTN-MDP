package app;
import java.util.Scanner;

public class Ejercicio6RevisionPrima {
	
	static Scanner scan;
	
	public static void RevisionPrima()
	{
		scan = new Scanner(System.in);
		int numero, num2;
		char control='s';
		
		while(control=='s')
		{
			System.out.print("\n\nDigite un numero: ");
			numero = scan.nextInt();			
			num2= numero-1;
			
			if(numero >=2)
			{
				while((numero%num2)!=0)/// esto va bien
				{
					num2--;			
				}
			
				if(num2 == 1)/// esto va bien
					System.out.print("El numero: "+numero +" es primo.");
				else
					System.out.print("El numero: "+numero +" NO es primo.");
			}
			else
				System.out.print("El numero: "+numero +" NO es permitido procesar.");
			
			System.out.print("\n\nQueres ingresar otro numero? --> ");
			control = scan.next().charAt(0);
		}
	}
}
