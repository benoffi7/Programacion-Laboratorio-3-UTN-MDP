package main;

import java.util.Scanner;

import cuenta.Cuenta;

public class Main {
	
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		boolean salir = false;
		int opcion = 0;
		float aux = 0;
		Cuenta cuenta = null;
		while (!salir) {
			mostrarMenu();
			opcion = sc.nextInt();
			switch (opcion) {
				case 1:
					if (cuenta == null) {
						cuenta = new Cuenta();
						System.out.println("¡Has creado una cuenta!");
					} else {
						System.out.println("Ya has creado una cuenta.");
					}
					break;
				case 2:
					if (cuenta == null) {
						System.out.print("Ingrese el saldo inicial que desea ingresar: ");
						aux = sc.nextFloat();
						cuenta = new Cuenta(aux);
						System.out.println("¡Has creado una cuenta con ["+aux+"$] iniciales!");
					} else {
						System.out.println("Ya has creado una cuenta.");
					}
					break;
				case 3:
					if (cuenta == null) {
						System.out.println("Aun no has creado una cuenta.");
						continue;
					}
					System.out.println("Ingrese la cantidad de dinero que desea agregar: ");
					aux = sc.nextFloat();
					cuenta.ingresar(aux);
					System.out.println("Has ingresado ["+aux+"$] a tu cuenta.");
					break;
				case 4:
					if (cuenta == null) {
						System.out.println("Aun no has creado una cuenta.");
						continue;
					}
					System.out.println("Ingrese la cantidad de dinero que desea retirar: ");
					aux = sc.nextFloat();
					if(cuenta.extraer(aux)) {
						System.out.println("Has retirado ["+aux+"$] de tu cuenta.");
					} else {
						System.out.println("No tienes esa cantidad de dinero para extraer.");
					}
					break;
				case 5:
					if (cuenta == null) {
						System.out.println("Aun no has creado una cuenta.");
						continue;
					}
					System.out.println("El saldo total de tu cuenta es de ["+cuenta.getSaldo()+"$]");
					break;
				case 6:
					salir = true;
					System.out.println("Saliendo del sistema.");
					break;
				default:
					System.out.println("Has ingresado una opcion incorrecta");
			}
		}
		
	}
	
	static void mostrarMenu() {
		System.out.println("-----Cajero Automatico-----");
		System.out.println("1) Crear cuenta vacia");
		System.out.println("2) Crear cuenta con saldo inicial");
		System.out.println("3) Ingresar dinero");
		System.out.println("4) Sacar dinero");
		System.out.println("5) Ver saldo");
		System.out.println("6) Salir");
		System.out.print("Ingrese opcion: ");
	}
}
