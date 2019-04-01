package tp1;

import java.util.Scanner;

public class Ej19 {
	public static void menu(Scanner scan) {
		System.out.println("Ejercicio nº20:Pide por teclado dos números y genera 10 números aleatorios\r\n" + 
				"entre esos números. Usa el método Math.random para generar un número\r\n" + 
				"entero aleatorio\r\n" );
		int num1,num2;
		System.out.println("Ingresa el Primer numero");
		num1 = Integer.parseInt(scan.next());
		System.out.println("Ingresa el Segundo numero");
		num2 = Integer.parseInt(scan.next());
		System.out.println("Los numeros aleatorios entre "+ num1+" y "+num2);
		try 
		{
			if(num1<num2)
				for(int i=1;i<=10;i++)
					System.out.println("Numero "+i+": "+aleatorio(num1,num2));
				else
					for(int i=1;i<=10;i++)
						System.out.println("Numero "+i+": "+aleatorio(num2,num1));
			Thread.sleep(3000);
		} 
		catch(InterruptedException ex) 
		{
			Thread.currentThread().interrupt();
		}
		
	}
	
	public static int aleatorio(int min, int max) {
		int resultado, rango;
		rango = (max - min)+1;
		resultado =(int)(Math.random()*rango)+ min;
		return resultado;
	}
}
