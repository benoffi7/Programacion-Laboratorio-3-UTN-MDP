package guia1;

import java.util.Scanner;


public class Ejercicio_9 
{
	public static void averiguar_a�o()
	{
		Scanner scan= new Scanner (System.in);
		int a�o;
		System.out.pintln("Ingrese un a�o:");
		int a�o = scan.nextInt();
		scan.close();
		
		if((a�o%4 == 0) && (a�o%100 !=0) || (a�o%400 == 0))  //usamos esta condicion porque son bisiestos todos los a�os 
		{                                                    //multiplos de 4, excepto aquellos que son multiplos de 100 pero no de 400
			System.out.println("El a�o ingresado es bisiesto.");
		}
		else
		{
			System.out.println("El a�o ingresado no es bisiesto.");
		}
		
	}
}
