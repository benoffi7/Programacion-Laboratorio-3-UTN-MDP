package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
	static Scanner scan;
	public static void opcionArea()
	{
		int operacion;
		scan = new Scanner(System.in);
		System.out.println("Que area desea calcular? 1-cuadrado 2-triangulo 3-rectangulo 4-circulo");
		operacion=scan.nextInt();
		area(operacion);
}
 public static void area(int opcion)
 {		
	 scan = new Scanner(System.in);
	 
	 double radio, area, base, altura, lado;
	 if (opcion==1)
	 {
		 System.out.println("ingrese un lado del cuadrado ");
		 	lado=scan.nextDouble();
		 	area=lado*lado;
	 }
	 if(opcion==2)
	 {
		 System.out.println("ingrese la base del triangulo ");
			base=scan.nextDouble();
			System.out.println("ingrese la altura del triangulo ");
			altura=scan.nextDouble();
			area=(base*altura)/2;
	 }
	 if (opcion==3)
	 {
		 System.out.println("ingrese la base del rectangulo ");
			base=scan.nextDouble();
			System.out.println("ingrese la altura del rectangulo ");
			altura=scan.nextDouble();
			area=(base*altura);
	 }
	 if(opcion==4)
	 {
		 System.out.println("ingrese el radio del circulo ");
		 radio=scan.nextDouble();
		 area=Math.PI*(radio*radio);
		 System.out.println("el area es "+area);
	 }
 }
}
