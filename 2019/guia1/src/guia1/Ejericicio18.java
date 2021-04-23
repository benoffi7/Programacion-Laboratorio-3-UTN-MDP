package guia1;

import java.util.Scanner;

public class Ejericicio18 {
	public static void calcularHipotenusa()
	{
		double cateto1=0,cateto2=0;
		float hipotenusa=0;
		Scanner leer=new Scanner(System.in);
		System.out.println("Ingrese el primer cateto");
		cateto1=leer.nextInt();
		System.out.println("Ingrese el segundo cateto");
		cateto2=leer.nextInt();
		hipotenusa=(float) Math.sqrt(Math.pow(cateto1, 2)+Math.pow(cateto2, 2));
		System.out.println("La longitud de la hipotenusa es "+hipotenusa);
	}
}
