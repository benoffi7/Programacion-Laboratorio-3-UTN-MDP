package tp1;

import java.util.Scanner;

public class Ej9 {
	public static void menu(Scanner scan) {
		System.out.println(" Ejercicio nº9: Encontrar el valor ASCII de un carácter.");
		boolean flag = true;
		char letra;
		while(flag){
			System.out.println("Ingrese un Caracter : ");
			letra = scan.next().charAt(0);
			System.out.println("El codigo ascii de "+ letra + " es " +(int)letra  );
			System.out.println("Desea continuar ? true / false");
			flag = Boolean.parseBoolean(scan.next());
		}
	}
}
