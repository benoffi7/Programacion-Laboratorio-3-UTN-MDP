package paquete;

import java.util.Scanner;

public class Main {

	public static int pedirNro ()
	{
		Scanner scan = new Scanner (System.in);
		System.out.print("Ingrese un numero: ");
		int nro = scan.nextInt();
		scan.close();
		return nro;
	}
	public static int dobleDeUnNro (int num)
	{
		int doble = num * 2;
		return doble;
	}
	public static int tripleDeUnNro (int num)
	{
		int triple = num * 3;
		return triple;
	}
	public static void leerNroMostrarDobleTriple()
	{
		int num = pedirNro();
		System.out.println("El doble del numero ingresado es: " + dobleDeUnNro(num) + " y el triple del numero ingresado es: " + tripleDeUnNro(num));
	}
	public static void main(String[] args) {
		leerNroMostrarDobleTriple();
	}

}
