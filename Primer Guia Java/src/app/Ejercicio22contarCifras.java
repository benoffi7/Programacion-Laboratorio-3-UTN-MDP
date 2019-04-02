package app;
import java.util.Scanner;
public class Ejercicio22contarCifras {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void ContarCifras() {
		
		System.out.print("\nIngrese un numero: ");
		int valor = scan.nextInt();
		int cifras= Integer.toString(valor).length();
		
		System.out.println("El numero ingresado "+valor+" tiene "+cifras +" cifras.");
	}
}