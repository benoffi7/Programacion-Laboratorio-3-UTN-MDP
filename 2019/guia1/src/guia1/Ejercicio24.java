package guia1;

import java.util.Scanner;

public class Ejercicio24 {
	public static void persona()
	{
		int edad=0;
		float salario;
		String nombre;
		Scanner leer= new Scanner(System.in);
		System.out.println("Ingrese el nombre");
		nombre=leer.next();
		System.out.println("Ingrese la edad");
		edad=leer.nextInt();
		System.out.println("Ingrese el salario");
		salario=leer.nextInt();
		if(edad<16)
		{
			System.out.println("No tenes edad para trabajar");

		}
		else if(50>edad && edad>19)
		{
			salario=(float) (salario*1.05);
		}
		else if(60>edad && edad>51)
		{
			salario=(float) (salario*1.1);
		}
		else if(edad>60)
		{
			salario=(float) (salario*1.15);
		}
		System.out.println("El salario es "+salario);

	}
}
