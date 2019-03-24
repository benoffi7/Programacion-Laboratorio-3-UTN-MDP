package ejercicios;

import java.util.Scanner;

public class Ejercicio18 {
	static Scanner scan;
	public static void Hipotenusa()
	{
		 scan = new Scanner(System.in);
		 double cateto1, cateto2;
		 System.out.println("ingrese el primer cateto ");
		 cateto1=scan.nextDouble();
		 System.out.println("ingrese el segundo cateto ");
		 cateto2=scan.nextDouble();
		 System.out.println("La hipotenusa vale "+Math.hypot(cateto1, cateto2));
	}
}
