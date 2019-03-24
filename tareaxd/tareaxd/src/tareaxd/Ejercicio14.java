package tareaxd;

import java.util.Scanner;

public class Ejercicio14 {
	public static Scanner scan;
public static void multiplicarPor2y3 () {
	scan = new Scanner(System.in);
	int num=0;
	System.out.println("Ingrese el numero: ");
	num=scan.nextInt();
	System.out.println("El doble de "+num +" es: "+ num*2);
	System.out.println("El triple de "+num +" es: "+ num*3);
}
}
