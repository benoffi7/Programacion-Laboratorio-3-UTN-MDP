package app;
import java.util.Scanner;

public class Ejercicio15CaF {
	
	static Scanner scan;
	
	public static void CelciusaFaren()
	{
		scan = new Scanner(System.in);
		System.out.print("\nIngrese grado centigrado: ");
		int centigrados = scan.nextInt();
		int fahrenheit = 32 + ( 9 * centigrados / 5);
		System.out.print("El grado centigrado ingresado es igual a: "+fahrenheit +" grados fahrenheit");
	}
}
