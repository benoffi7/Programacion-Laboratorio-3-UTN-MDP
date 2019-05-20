package paquete;

import java.util.Scanner;

public class Main {

	public static float leerRadio ()
	{
		Scanner scan = new Scanner (System.in);
		System.out.print("Ingrese el radio de la circunferencia: ");
		float radio = scan.nextFloat();
		scan.close();
		return radio;
	}
	public static void mostrarLongitudYArea ()
	{
		float radio = leerRadio();
		float longitud = 2 * (float) Math.PI * radio;
		float area = (float) Math.PI * (radio*radio); 
		System.out.print("La longitud de la circunferencia es " + longitud + " y el area es "+ area);
	}
	public static void main(String[] args) {
		mostrarLongitudYArea();
	}

}
