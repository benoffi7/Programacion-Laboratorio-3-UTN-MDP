package guia1;

import java.util.Scanner;

public class Ejercicio16 {
	public static void calcularLongitudYarea()
	{
		double radio;
		float longitud=0, area=0;
		Scanner leer= new Scanner(System.in);
		System.out.println("Ingrese el radio del circulo");
		radio=leer.nextDouble();
		longitud=(float) (2*Math.PI*radio);
		area=(float) (Math.PI*Math.pow(radio, 2));
		System.out.println("La longitud es "+longitud+"\nEl area es "+area);

	}
}
