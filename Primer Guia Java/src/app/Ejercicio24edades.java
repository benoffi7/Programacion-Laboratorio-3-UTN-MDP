package app;
import java.util.Scanner;

public class Ejercicio24edades {
	
	static Scanner scan = new Scanner(System.in);
	static int edad;
	static String nombre;
	static float salario;
	
	public static void EdadesLaburales() {
		
		System.out.print("\nIngrese nombre: ");
		nombre = scan.next();
		
		System.out.print("Ingrese edad: ");
		edad = scan.nextInt();
		
		System.out.print("Ingrese salario: ");
		salario = scan.nextFloat();
		
		if(edad< 16)
			System.out.println("Esta persona no debe trabajar no cumple con la edad.");
		
		if((edad <= 50) && (edad >=19))
		{
			salario = (float)salario + (float)(salario*0.05);
			System.out.println("el salario es: "+salario);
		}
		
		if((edad <= 60) && (edad >=51))
		{
			salario = (float)salario + (float)(salario*0.10);
			System.out.println("el salario es: "+salario);
		}
		
		if(edad> 60)
		{
			salario = (float)salario + (float)(salario*0.15);
			System.out.println("el salario es: "+salario);
		}		
	}
}