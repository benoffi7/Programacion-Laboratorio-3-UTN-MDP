package tp1;

import java.util.Scanner;
public class Ej23 {
	public static void menu(Scanner scan) {
		System.out.println("Ejercicio nº23: Pide por teclado el nombre, edad y salario y muestra el salario\r\n" + 
				" Si es menor de 16 no tiene edad para trabajar\r\n" + 
				" Entre 19 y 50 años el salario es un 5 por ciento más\r\n" + 
				" Entre 51 y 60 años el salario es un 10 por ciento más\r\n" + 
				" Si es mayor de 60 el salario es un 15 por ciento más");
		
		String nombre;
		int edad;
		int salario, calculo;
		System.out.println("Ingrese el nombre de la persona ");
		nombre = scan.next();
		System.out.println("Ingrese la edad");
		edad = Integer.parseInt(scan.next());
		System.out.println("Ingrese el salario");
		salario = Integer.parseInt(scan.next());
		persona person = new persona(nombre,edad,salario);
		
		calculo = person.calcularSalario();
		try 
		{	
			if(calculo == -1)
				System.out.println("La persona no tiene edad para trabajar");
			else
				System.out.println("El salario es "+ person.getSalario() +" el total es :"+ calculo );
			
			Thread.sleep(3000);
		}
		catch(InterruptedException ex) 
			{
			Thread.currentThread().interrupt();
			}
		
	}

	
}

