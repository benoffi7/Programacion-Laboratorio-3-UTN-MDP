package guia1;

import java.util.Scanner;

public class Ejercicio21 {
	public static void diaLaboral()
	{
		String dia;
		int op=0;
		Scanner leer= new Scanner(System.in);
		System.out.println("Ingrese un dia");

		dia=leer.next();
		
		switch(dia)
		{
		case "lunes":
		{
            System.out.println("Dia Laboral");

			break;
		}
		case "martes":
		{
			System.out.println("Dia Laboral");
			break;
		}
		case "miercoles":
		{
			System.out.println("Dia Laboral");
			break;
		}
		case "jueves":
		{
			System.out.println("Dia Laboral");
			break;
		}
		case "viernes":
		{
			System.out.println("Dia Laboral");
			break;
		}
		case "sabado":
		{
			System.out.println("Dia NO Laboral");
			break;
		}
		case "domingo":
		{
			System.out.println("Dia NO Laboral");
			break;
		}
		}
	}
}
