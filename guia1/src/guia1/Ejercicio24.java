package guia1;

import java.util.Scanner;

public class Ejercicio24 {

	static Scanner scan;
	static String nombre;
	static int edad;
	static float salario;
	
	public static void resolucionEjer24()
	{
		IngresoDeDatos();
		if(edad<16)
		{
			System.out.print("No tiene edad para trabajar");
			
		}else if(edad>=19 && edad<=50)
		{
			salario += salario * 0.05; 
			System.out.print(salario);
			
		}else if(edad>=51 && edad<=60)
		{
			salario += salario * 0.1; 
			System.out.print(salario);
		}else if(edad>=60)
		{
			salario += salario * 0.15; 
			System.out.print(salario);
		}
	}
	
	public static void IngresoDeDatos()
	{
		scan = new Scanner(System.in);
		System.out.print("Nombre: ");
		nombre = scan.next();
		System.out.print("Edad: ");
		edad=scan.nextInt();
		System.out.print("Salario: ");
		salario = scan.nextFloat();
	}
}
