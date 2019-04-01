package tp1;

import java.util.Scanner;

public class Ej15 {
	public static void menu (Scanner scan) {
		System.out.println("Ejercicio nº15: Programa que lea por teclado el valor del radio de una\r\n" + 
				"circunferencia y calcula y muestra por pantalla la longitud y el área de la\r\n" + 
				"circunferencia. Investigar el uso de la librería Math.\r\n" + 
				"Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia =\r\n" + 
				"PI*Radio^2");
		double radio,longitud,area;
		System.out.println("Ingrese el radio de la circunferencia :");
		radio = Double.parseDouble(scan.next());
		longitud = longitudCircunferencia(radio);
		area = areaCircunferencia(radio);
		try 
			{
				System.out.println("La longitud de la circunferencia es : "+longitud+"\r\n"
					+"El area de la circunferencia es: "+area+"\r\n ");
				Thread.sleep(3000);
			} 
			catch(InterruptedException ex) 
			{
				Thread.currentThread().interrupt();
			}
		
	}
	
	public static double longitudCircunferencia (double radio) {
		double longitud = 2*Math.PI*radio;
		return longitud;
	}
	
	public static double areaCircunferencia (double radio) {
		double area = Math.PI*Math.pow(radio,2);
		return area;
	}
}
