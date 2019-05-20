package paquete;

import java.util.Scanner;

public class Main {

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
	public static void ingresarUnNumeroYRevisarSiEsPrimo ()
	{
		Scanner scan = new Scanner (System.in);
		int num = 0;
		char control = 's';
		while (control == 's' || control == 'S')
		{
			System.out.println("Ingrese un numero para revisar si es primo o no: ");
			num = scan.nextInt();
			if (revisarSiEsPrimo(num))
				System.out.println("El numero " + num + " es primo.");
			else
				System.out.println("El numero " + num + " no es primo.");
			System.out.println("\nDesea seguir revisando numeros? S/N");
			control = scan.next().charAt(0);
			System.out.println(" ");
		}
		scan.close();		
	}
	public static void main(String[] args) {
		ingresarUnNumeroYRevisarSiEsPrimo();
	}

}
