package guia1;

import java.util.Scanner;

public class ejercicio9 {

	static Scanner scan;
	
	public static void esBisiesto()
	{
		int anio;
		scan = new Scanner(System.in);
		System.out.println("ingrese un año: ");
		anio = scan.nextInt();
		
		if(((anio % 4 == 0)&&(anio % 100 != 0 ))||(anio % 400 == 0))
		{
			System.out.println("ES BISIESTO");
		}else {
			System.out.println("NO ES BISIESTO");
		}
	}
}
