package guia1;
import java.util.Scanner;
import java.lang.Math;

public class Ejercicio_18 
{
	public static void calcular_hipotenusa ()
	{
		Scanner scan= new Scanner (System.in);
		int cat1, cat2, hipotenusa, n=2;
		float resultado;
		
		System.out.println("Ingrese el valor del primer cateto:");
		int cat1 = scan.nextInt();
		System.out.println("Ingrese el valor del segundo cateto:");
		int cat2 = scan.nextInt();
		scan.close();
		
		int hipotenusa= (int) Math.pow(cat1, n) + Math.pow(cat2, n); //primer cateto al cuadrado mas segundo cateto al cuadrado
			
		float resultado = (float) Math.sqrt(hipotenusa); //saco la raiz con math.sqrt
		
		System.out.println("El valor de la hipotenusa es de: " + resultado);
		
	}
}
