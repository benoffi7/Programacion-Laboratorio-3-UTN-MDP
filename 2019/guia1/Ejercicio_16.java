package guia1;
import java.lang.Math;
import java.util.Scanner;


public class Ejercicio_16 
{
	public static void calculos_de_Circurferencia ()
	{
		Scanner scan= new Scanner (System.in);
		int radio, radioAlaDos, n=2;
		double longitud, area;
		
		System.out.println("Ingrese el valor del radio:");
		int radio= scan.nextInt(); 
		
		longitud= 2*Math.PI*radio;
		
		radioAlaDos= Math.pow(radio, n);
		area= Math.PI*radioAlaDos;
		
		scan.close();
		
		System.out.println("La longitud es de:" + longitud);
		System.out.println("El area es de:" + area);

	}
}
