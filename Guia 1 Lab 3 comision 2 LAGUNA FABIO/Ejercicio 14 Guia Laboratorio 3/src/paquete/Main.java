package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingrese un numero");
		int num = scan.nextInt();
		scan.close();
		
		int doble = calcularDoble (num);
		int triple = calcularTriple (num);
		
		System.out.println("El doble de " + num + " es " + doble);
		System.out.println("El triple de " + num + " es " + triple);
	}
	
	public static int calcularDoble (int num) {
		
		int res=num*2;
		
		return res;
	}
	
	public static int calcularTriple (int num) {
		
		int res=num*3;
		
		return res;
	}
}
