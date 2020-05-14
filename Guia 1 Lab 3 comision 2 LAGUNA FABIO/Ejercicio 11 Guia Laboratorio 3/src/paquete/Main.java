package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Primer numero");
		int num1 = scan.nextInt();
		System.out.println("Segundo numero");
		int num2 = scan.nextInt();
		scan.close();
		
		
		int res = multiplicar (num1,num2);
		System.out.println("El resultado es " + res);
	}
	
	public static int multiplicar (int num1, int num2) {
		
		int res;
		res = num1*num2;
		
		return res;
	}

}
