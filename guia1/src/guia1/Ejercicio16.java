package guia1;

import java.util.Scanner;

public class Ejercicio16 {
	
	static Scanner scan;
	
	public static void resolucionEjer16()
	{
		scan = new Scanner(System.in);
		double radio;
		System.out.print("Ingrese el radio: ");
		radio = scan.nextDouble();
		longitudCircunferencia(radio);
		areadelaCircunferencia(radio);
	}
	
	public static void longitudCircunferencia(double radio)
	{
		double resultado = 2*Math.PI*radio;
		System.out.print("\nLongitud de la circunferencia: "+resultado);
	}
	
	public static void areadelaCircunferencia(double radio)
	{
		double resultado = Math.PI*Math.pow(radio, 2);
		System.out.print("\nArea de la circunferencia: "+resultado);

	}
	
}
