package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Ingrese un numero por teclado");
		
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();
		scan.close();
		
		int flag = comprobarParInpar(num);
		
		if (flag==1) {
			System.out.println("El numero " + num + " es inpar");
		} else {
			System.out.println("El numero " + num + " es par");
		}

	}
	
	public static int comprobarParInpar (int num) {
		
		int res = num%2;
		
		return res;
	}

}
