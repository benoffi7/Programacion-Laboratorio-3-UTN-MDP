package guia1;
import java.util.Scanner;

public class Ejercicio_15 
{
	public static void pasaje_fahrenheit ()
	{
		Scanner scan= new Scanner (System.in);
		float grados, fahrenheit;
		
		System.out.println("Ingrese los grados a calcular: ");
		float grados= scan.nextFloat();  
		scan.close();
		
		fahrenheit= 32 + (9*grados / 5);
		
		System.out.println("Los grados fahrenheit son:" + fahrenheit);

	}
}
