package paquete;

import java.util.Scanner;

public class Main {

	public static int pedirNroPositivo ()
	{
		Scanner scan = new Scanner (System.in);
		System.out.print("Ingrese un numero positivo: ");
		int num = scan.nextInt();
		System.out.println();
		while (num<=0)
		{
			System.out.print("Ha ingresado un numero que no es positivo, ingrese nuevamente un numero: ");
			num = scan.nextInt();
		}
		scan.close();
		return num;			
	}
	public static void mostrarCifrasNroPositivo ()
	{
		int nro = pedirNroPositivo();
		System.out.println();
		System.out.println("El numero " + nro + " tiene " + Integer.toString(nro).length() + " cifras" );
	}
	public static void main(String[] args) {
		mostrarCifrasNroPositivo();
	}

}
