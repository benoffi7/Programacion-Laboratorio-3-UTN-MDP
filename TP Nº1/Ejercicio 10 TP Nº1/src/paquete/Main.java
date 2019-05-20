package paquete;

import java.util.Scanner;

public class Main {

	public static int valorASCII ()
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingrese el caracter que quiere conocer el valor: ");
		int valorAscii = scan.next().charAt(0);
		scan.close();
		return valorAscii;
	}
	public static void main(String[] args) {
		System.out.println("El valor ASCII del caracter ingresado es: " + valorASCII());
	}

}
