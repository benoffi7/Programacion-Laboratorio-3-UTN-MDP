package app;
import java.util.Scanner;

public class Ejercicio18catetos {
	
	static Scanner scan = new Scanner(System.in);
	static double catetoA;
	static double catetoB;
	static double hipotenusa;
	
	public static void calcular() {
		
		System.out.print("\nIngrese cateto A: ");
		catetoA = scan.nextDouble();
	
		System.out.print("\nIngrese cateto B: ");
		catetoA = scan.nextDouble();
		
		hipotenusa = hipotenusa();
		System.out.print("\nLa hipotenusa es: " + hipotenusa);
	}
	
	public static double hipotenusa() {
		
		hipotenusa = Math.sqrt(Math.pow(catetoA, 2)+Math.pow(catetoB, 2));
		return hipotenusa;
	}
}
