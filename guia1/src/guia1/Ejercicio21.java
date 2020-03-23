package guia1;

import java.util.Scanner;

public class Ejercicio21 {
	
	static Scanner scan;
	
	public static String cargarDia()
	{
		String dia;
		scan = new Scanner(System.in);
		System.out.print("Ingrese dia: ");
		dia = scan.next();
		return dia;
	}
	
	public static void resolucionEjer21()
	{
		scan = new Scanner(System.in);
		
		String opcion = cargarDia();
		
		switch(opcion)
		{
		case "lunes":
			System.out.print("Dia laboral");
			break;
		case "martes":
			System.out.print("Dia laboral");
			break;
		case "miercoles":
			System.out.print("Dia laboral");
			break;
		case "jueves":
			System.out.print("Dia laboral");
			break;
		case "viernes":
			System.out.print("Dia laboral");
			break;
		case "sabado":
			System.out.print("Dia no laboral");
			break;
		case "domingo":
			System.out.print("Dia no laboral");
			break;
		default:
			System.out.print("opcion invalida");
		}
	}

}
