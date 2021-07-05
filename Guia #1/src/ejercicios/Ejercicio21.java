package ejercicios;

import java.util.Scanner;

public class Ejercicio21 {
	static Scanner scan;
	public static void diaSemana()
	{
		 scan = new Scanner(System.in);
		 String dia;
		 System.out.println("ingrese el dia de semana (En minuscula, mi no saber hacerlo case sensitive xd)");
		 dia=scan.nextLine();
		 switch(dia)
		 {
		 case "sabado":
		 {
			 System.out.println("hoy no se labura pa");
			 break;
		 }
		 case "domingo":
		 {
			 System.out.println("hoy no se labura pa");
			 break;
		 }
		 case "lunes":
		 {
			 System.out.println("hoy toca laburar ran :(");
			 break;
		 }
		 case "martes":
		 {
			 System.out.println("hoy toca laburar ran :(");
			 break;
		 }
		 case "miercoles":
		 {
			 System.out.println("hoy toca laburar ran :(");
			 break;
		 }
		 case "jueves":
		 {
			 System.out.println("hoy toca laburar ran :(");
			 break;
		 }
		 case "viernes":
		 {
			 System.out.println("hoy toca laburar ran :(");
			 break;
		 }
		 default:
		 {
			 System.out.println("Ese dia no existe salame >:(");
			 break;
		 }
		 }
	}
		 
}
