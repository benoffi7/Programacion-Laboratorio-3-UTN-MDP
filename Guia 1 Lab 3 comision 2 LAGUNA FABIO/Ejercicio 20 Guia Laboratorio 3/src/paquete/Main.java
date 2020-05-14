package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese el primer numero:");
		int num1 = scan.nextInt();
		System.out.println("Ingrese el segundo numero (diferente al primero):");
		int num2 = scan.nextInt();
		scan.close();
		
		iniciar (num1,num2);
	}
	
	public static void iniciar (int num1, int num2) {
		
		int resta;
		if (num1<num2) {
			resta = num2-num1;
			generarNumeros (resta,num1);
		}else {
			if (num1>num2) {
				resta = num1-num2;
				generarNumeros (resta,num2);
			}else {
				System.out.println("No se pueden generar numeros");
			}
		}
	}
	
	public static void generarNumeros (int resta, int menor) {
		
		int i;
		
		for (i=0 ; i<10 ; i++) {
			int numeroRandom = (int)(Math.random()*(resta+1)+menor);
			System.out.println(numeroRandom);
		}
	}

}
