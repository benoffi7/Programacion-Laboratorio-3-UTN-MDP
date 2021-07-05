package ejercicios;

import java.util.Scanner;

public class Ejercicio22 {
	static Scanner scan;
	public static void cuentaDigitos()
	{
		 scan = new Scanner(System.in);
		 int numero, digitos=0;
		 System.out.println("ingrese un numero");
		 numero=scan.nextInt();
		 
		 while(numero !=0)
		 {
		   numero = numero/10;
		   digitos++;
		 }
		 System.out.println(digitos);
	}
}
