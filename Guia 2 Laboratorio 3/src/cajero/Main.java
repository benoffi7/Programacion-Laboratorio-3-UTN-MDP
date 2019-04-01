package cajero;

import java.util.Scanner;

public class Main {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		menu();
		scan.close();
	}
	
	public static void menu() {
		
		int opcion=0;
		float cant=0;
		Cuenta cuenta=null;
		
		System.out.println("1_ Crear cuenta vacia");
		System.out.println("2_ Crear cuenta saldo inicial");
		System.out.println("3_ Ingresar dinero");
		System.out.println("4_ Sacar dinero");
		System.out.println("5_ Ver saldo");
		System.out.println("6_ Salir");
		
		while (opcion!=6) {
			do {
				System.out.println("Escoga una opcion");
				opcion = scan.nextInt();
				if ((opcion<1)||(opcion>6))
					System.out.println("Opcion incorrecta");
			}while((opcion<1)||(opcion>6));
			
			switch(opcion) {
				case 1: 
					if (cuenta==null) {
						cuenta = new Cuenta();
						System.out.println("Su cuenta ha sido creada");
					}else {
						System.out.println("Ya hay una cuenta existente");
					}
					break;
				case 2:
					if (cuenta==null) {
						System.out.println("Ingrese saldo inicial de la cuenta:");
						cant = scan.nextFloat();
						cuenta = new Cuenta(cant);
						System.out.println("Su cuenta con saldo de " + cant + " ha sido creada");
					}else {
						System.out.println("Ya hay una cuenta existente");
					}
					break;
				case 3:
					if (cuenta!=null) {
						System.out.println("Que cantidad de dinero quiere ingresar a su cuenta?");
						cant = scan.nextFloat();
						cuenta.ingresar(cant);
					}else {
						System.out.println("No hay ninguna cuenta existente");
					}
					break;
				case 4:
					if (cuenta!=null) {
						System.out.println("Que cantidad de dinero quiere extraer de su cuenta?");
						cant = scan.nextFloat();
						cuenta.extraer(cant);
					}else {
						System.out.println("No hay ninguna cuenta existente");
					}
					break;
				case 5:
					if (cuenta!=null)
						System.out.println("Su saldo actual es de " + cuenta.getSaldo());
					else
						System.out.println("No hay ninguna cuenta existente");
			}
		}
		
	}

}
