package guia1;

import java.util.Scanner;


public class Ejercicio_11 
{
	public static void multiplicar_dos_num ()
	{
		Scanner scan= new Scanner (System.in);
		int num1, num2, rta;
		
		System.out.println("Ingrese el primer numero:");
		int num1 = scan.nextInt();  
		
		System.out.println("Ingrese el segundo numero:");
		int num2 = scan.nextInt(); 
		
		scan.close();
		
		rta= num1*num2;
		
		System.out.println("El resultado de la multiplicacion es: " + rta);
	}
}
