package ejercicios;

import java.util.Scanner;

public class Ejercicio16 {
static Scanner scan;
public static void areaYlongitud()
{
	 scan = new Scanner(System.in);
	double radio, area, largo;
	 System.out.println("ingrese el radio del circulo ");
	 radio=scan.nextDouble();
	 area=Math.PI*(radio*radio);
	 largo=2*Math.PI*radio;
	 System.out.println("el area es "+ area);
	 System.out.println("el largo es "+ largo);
}
}
