package app;
import java.util.Scanner;

public class Ejercicio2parimpar {
	
	static Scanner scan;
	
	public static void VerificacionPar()
	{
		boolean flag = false;
		scan = new Scanner(System.in);
		System.out.print("\n\nIngrese un numero: ");
		int numero = scan.nextInt();
		
		if(numero % 2 == 0)
			flag = true;		
		
		if(flag == true)
			System.out.print("es par.\n");
		else
			System.out.print("es impar.\n");
	}
}