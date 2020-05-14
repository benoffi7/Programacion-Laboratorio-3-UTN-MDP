package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Ingrese caracter para encontrar su valor ASCII");
		Scanner scan = new Scanner (System.in);
		char caracter = scan.next().charAt(0);
		scan.close();
		
		int num = encontrarAscii (caracter);
		System.out.println("El valor ASCII del caracter " + caracter + " es " + num);
		
	}
	
	public static int encontrarAscii (char caracter) {
		
		int codigo = (int)caracter;
		
		return codigo;
	}

}
