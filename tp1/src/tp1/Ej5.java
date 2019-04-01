package tp1;

import java.util.Scanner;

public class Ej5 {
	public static void menu(Scanner scan) {
		System.out.println("Ejercicio nº5: Ingresar un número o tantos como quiera el usuario y revisar si es primo\r\n" + 
				"");
		boolean flag = true, check = false;
		int number = 0;
		while(flag){
			System.out.println("Ingrese un numero : ");
			number = Integer.parseInt(scan.next());
			check = checkPrime(number);
			if(check)
				System.out.println("El numero es primo");
			else 
				System.out.println("El numero no es primo");
			System.out.println("Desea continuar ? true / false");
			flag = Boolean.parseBoolean(scan.next());
		}
	}
	public static boolean checkPrime(int number) {
		int flag =1;
		boolean result = false;
		int max = number/2;
		if(number == 0 || number == 1) {
			flag = 0;
		}else {
			for(int i =2 ; i<=max;i++) {
				if(number%i == 0) {
					flag = 0;
					break;
				}
			}
		}
		if (flag == 1) 
			result = true;
		return result;
	}
}
