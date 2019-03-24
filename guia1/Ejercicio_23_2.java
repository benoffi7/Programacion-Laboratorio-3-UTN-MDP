package guia1;
import java.util.Scanner;

public class Ejercicio_23_2 
{
	public static void mostrar_salarios ()
	{
		Scanner scan = new Scanner(System.in);
		String nombre;
		int edad, salario, salarioFinal, agregado;
		
		System.out.println("Ingrese su nombre: ");
		String nombre= scan.next();
		
		System.out.println("Ingrese su edad: ");
		int edad= scan.nextInt();
		
		System.out.println("Ingrese su salario: ");
		int salario= scan.nextInt();
		
		if (edad<16)
		{
			System.out.println("No tiene edad para trabajar.");
		}
		else
		{
			if (edad>19 && edad<50)
			{
				agregado= (salario*5)/100;
				salarioFinal= salario+agregado;
				System.out.println("Su salario es de: " + salarioFinal);
			}
			else
			{
				if(edad>51 && edad<60)
				{
					agregado= (salario*10)/100;
					salarioFinal= salario+agregado;
					System.out.println("Su salario es de: " + salarioFinal);
				}
				else
				{
					agregado= (salario*15)/100;
					salarioFinal= salario+agregado;
					System.out.println("Su salario es de: " + salarioFinal);
				}
			}
			
			
		}
		scan.close();
		
	}
}
