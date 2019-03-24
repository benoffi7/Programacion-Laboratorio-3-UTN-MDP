package paquete;

import java.util.Scanner;

public class Main {

	public static int celsiusAFarenheit()
	{
		Scanner scan = new Scanner (System.in);
		System.out.print("Ingrese los grados centigrados que quiere pasar a Farenheit: ");
		int celsius = scan.nextInt();
		int Farenheit = 32 + ((9 * celsius)/5);
		scan.close();
		return Farenheit;
	}
	public static void mostrarCelsiusAFarenheit ()
	{
		System.out.println("Los grados centigrados ingresados son " + celsiusAFarenheit() + "º Farenheit.");
	}
	public static void main(String[] args) {
		mostrarCelsiusAFarenheit();

	}

}
