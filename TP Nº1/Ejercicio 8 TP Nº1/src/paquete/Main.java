package paquete;

import java.util.Scanner;

public class Main {

	
	public static int contarNumerosPositivos ()
	{	
		int num = 0;
		char control = 's';
		int cantNrosPositivos=0;
		Scanner scan = new Scanner (System.in);
		while (control == 's' || control == 'S')
		{
			System.out.println("Ingrese un numero");
			num = scan.nextInt();
			if (num>0)
				cantNrosPositivos++;
			System.out.println("Desea continuar ingresando numeros? S/N");
			control = scan.next().charAt(0);
			System.out.println("");
		}
		scan.close();
		return cantNrosPositivos;		
	}
	public static void main(String[] args) {
		System.out.println("La cantidad de numeros positivos ingresados es: " + contarNumerosPositivos());
	}

}
