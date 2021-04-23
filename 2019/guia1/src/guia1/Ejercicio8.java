package guia1;

import java.util.Scanner;

public class Ejercicio8 {
	public static void sumarPositivos()
	{
		int num=0,cantidadPositivos=0;
		int control=1;
		Scanner leer= new Scanner(System.in);
		while(control==1)
		{
			System.out.println("ingrese un numero");
			num=leer.nextInt();
			if(num>0)
			{
				cantidadPositivos++;
			}
			System.out.println("Desea agregar otro numero? 1/0");
			control=leer.nextInt();
			System.out.print(control);
			
		}
		System.out.println("La cantidad de positivos es " +cantidadPositivos);
		leer.close();

	}
}
