package guia1;

import java.util.Scanner;


public class Ejercicio_9 
{
	public static void averiguar_año()
	{
		Scanner scan= new Scanner (System.in);
		int año;
		System.out.pintln("Ingrese un año:");
		int año = scan.nextInt();
		scan.close();
		
		if((año%4 == 0) && (año%100 !=0) || (año%400 == 0))  //usamos esta condicion porque son bisiestos todos los años 
		{                                                    //multiplos de 4, excepto aquellos que son multiplos de 100 pero no de 400
			System.out.println("El año ingresado es bisiesto.");
		}
		else
		{
			System.out.println("El año ingresado no es bisiesto.");
		}
		
	}
}
