package tp1;

import java.util.Scanner;

public class Ej7 {
	public static void menu(Scanner scan) {
		System.out.println("Ejercicio nº8: Sumar (en cantidad, no acumular) cuántos números positivos ingresa un usuario. \r\n");
		boolean flag = true;
		int number = 0;
		int quantity = 0;
		while(flag){
			System.out.println("Ingrese un numero : ");
			number = Integer.parseInt(scan.next());
			if(positive(number)) {
				System.out.println("El numero es positivo");
				quantity++;
			}
			else
				System.out.println("El numero no es positivo");
			System.out.println("Desea continuar ? true / false");
			flag = Boolean.parseBoolean(scan.next());
		}
		try        
		{
			System.out.println("La cantidad de numeros positivos son : "+ quantity);
		    Thread.sleep(3000);
		} 
		catch(InterruptedException ex) 
		{
		    Thread.currentThread().interrupt();
		}
	}
	public static boolean positive(int number) {
		boolean flag = false;
		if(number > 0 )
			flag = true;
		return flag;
	}
}
