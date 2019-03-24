package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Ingresar año");
		Scanner scan = new Scanner (System.in);
		int año = scan.nextInt();
		scan.close();
		
		int flag = comprobarBisiesto (año);
		if (flag==0) {
			System.out.println("El año " + año + " es bisiesto");
		}else {
			System.out.println("El año " + año + " no es bisiesto");
		}
	}
	
	public static int comprobarBisiesto (int año) {
		
		int res;
		res = año%4;
		
		return res;
	}

}
