package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Nombre:");
		String nombre = scan.next();
		scan.close();
		
		mostrarNombre (nombre);
	}
	
	public static void mostrarNombre (String nombre) {
		
		System.out.println("Buenos dias " + nombre);
	}

}
