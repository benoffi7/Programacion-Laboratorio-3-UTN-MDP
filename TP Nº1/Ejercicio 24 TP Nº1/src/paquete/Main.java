package paquete;

import java.util.Scanner;

public class Main {
	
	public static void nombreEdadSalario ()
	{
		Scanner scan = new Scanner (System.in);
		System.out.print("Ingrese su nombre: ");
		String nombre = scan.next();
		System.out.println();
		System.out.print("Ingrese su edad: ");
		int edad = scan.nextInt();
		System.out.println();
		if (edad < 16)
			System.out.println("No tiene edad para trabajar.");
		else 
		{
			System.out.print("Ingrese su salario: ");
			float salario = scan.nextFloat();
			System.out.println();
			if ((edad >= 19) && (edad <= 50))
			{
				salario = (float) (salario * (1.05)); //Si pongo 105/100 no hace la cuenta y da cero
			}											//No entiendo porque tengo que castearlo
			else
			{
				if (edad >= 51 && edad <= 60)
					salario = (float) (salario * (1.1));
				else
					if (edad > 60)
						salario = (float) (salario * (1.15));
			}
			System.out.println("Su salario por su edad es: " + salario);
		}
	}
	
	public static void main(String[] args) {
		nombreEdadSalario();
	}

}
