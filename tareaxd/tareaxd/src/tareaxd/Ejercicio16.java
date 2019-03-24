package tareaxd;

import java.util.Scanner;

public class Ejercicio16 {
	public static Scanner scan;
	public static void areaCircunCirculo() {
		scan = new Scanner(System.in);
		double radio=0,area=0,circunferencia=0;
		System.out.println("Ingrese el radio de la circunferencia: ");
		radio=scan.nextFloat();
		area= Math.PI * radio * radio;
		circunferencia=Math.PI*radio*2;
		System.out.println("Area: "+area+"  Circunferencia: "+circunferencia);		
	}
}
