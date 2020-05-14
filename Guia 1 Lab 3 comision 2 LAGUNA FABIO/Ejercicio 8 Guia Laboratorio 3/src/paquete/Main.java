package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int cantidad = ingresarNumeros ();
		System.out.println("El usuario ingreso " + cantidad + " numero/s");
	}
	
	public static int ingresarNumeros () {
		
		int i=0;
		String control = "Si";
		Scanner scan = new Scanner (System.in);
		
		while (control.equalsIgnoreCase("Si")) {
			System.out.println("Ingrese un numero");
			int num = scan.nextInt();
			i++;
			System.out.println("Continuar cargando numeros? Ingrese 'Si' para seguir");
			control = scan.next();
		}
		scan.close();
		
		return i;
	}

}
