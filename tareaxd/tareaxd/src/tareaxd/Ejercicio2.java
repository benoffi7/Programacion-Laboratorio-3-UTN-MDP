package tareaxd;

import java.util.Scanner;

public class Ejercicio2 {
	public static Scanner scan;
//Devuelve true si el numero es par, si no lo es, devuelve false
	public static boolean controlPar(int num) 
	{
		boolean flag=true;
		if (num%2==1) {
			flag=false;
		}
		return flag;
	}
	public static void controlParMuestra() {
		scan = new Scanner(System.in);
		int num=0;
		boolean flag=true;
		System.out.println("Ingrese un numero para saber si es par:");
		num=scan.nextInt();
		flag=controlPar(num);
		if(flag==true) {
			System.out.println("El numero es par.");
		}
		else {
			System.out.println("El numero no es par.");
		}
	}
}
