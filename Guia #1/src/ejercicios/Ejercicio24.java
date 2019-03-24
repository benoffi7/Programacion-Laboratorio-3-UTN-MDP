package ejercicios;

import java.util.Scanner;

public class Ejercicio24 {
	static Scanner scan;
	public static void cuentaSalario()
	{
		 scan = new Scanner(System.in);
		 System.out.println("Ingrese nombre");
		 String nombre= scan.nextLine();
		 System.out.println("Ingrese edad");
		 int edad =scan.nextInt();
		 System.out.println("Ingrese salario correspondido");
		 double salario= scan.nextDouble();
		 if(edad<16)
		 {
			 System.out.println("No tiene edad para trabajar :c");
		 }
		 else if(edad>=19 && edad<=50)
		 {
			 System.out.println("Le corresponden "+(salario*105)/100+" a "+ nombre);
		 }
		 else if (edad>=51 && edad<=60)
		 {
			 System.out.println("Le corresponden "+(salario*110)/100+" a "+ nombre);
		 }
		 else if (edad>60)
		 {
			 System.out.println("Le corresponden "+(salario*115)/100+" a "+ nombre);
		 }
		 
	}	
}
	
