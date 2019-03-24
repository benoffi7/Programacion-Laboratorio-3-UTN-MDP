package paquete;

import java.util.Scanner;

public class Main {

	public static String leerNombre ()
	{
		System.out.print("Ingrese un nombre: ");
		Scanner scan = new Scanner (System.in);
		String nombre = scan.next();
		System.out.println(" ");
		scan.close();
		return nombre;
	}
	public static void mostrarNombre (String nombre)
	{
		System.out.println("Buenos dias " + nombre);
	}
	public static void leerYMostrarNombre ()
	{
		String nombre = leerNombre();
		mostrarNombre(nombre);
	}
	
	public static void main(String[] args) {
		leerYMostrarNombre();
	}

}
