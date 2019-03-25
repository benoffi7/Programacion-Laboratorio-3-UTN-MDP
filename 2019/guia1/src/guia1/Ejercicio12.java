package guia1;

import java.util.Scanner;

public class Ejercicio12 {
	public static void calcularAreas()
	{
		int op1=0;
		float lado1=0,lado2=0,lado3=0, area=0;
		Scanner leer=new Scanner(System.in);
		System.out.println("De que desea sacar el area? 1 Cuadrado 2 Rectangulo 3 Triangulo Rectangulo 4 Circulo \n");
		op1=leer.nextInt();
		switch (op1)
		{
		case 1:
		{
			System.out.println("ingresa un lado del cuadrado\n");
			lado1=leer.nextFloat();
			System.out.println("El area es "+area);			
			break;
		}
		case 2:
		{
			System.out.println("ingresa el primer lado del rectangulo\n");
			lado1=leer.nextFloat();
			System.out.println("ingresa el segundo lado del rectangulo\n");
			lado2=leer.nextFloat();
			area= lado1 * lado1;
			System.out.println("El area es "+area);

			break;
		}
		case 3:
		{
			System.out.println("ingresa el primer lado del triangulo\n");
			lado1=leer.nextFloat();
			System.out.println("ingresa el segundo lado del triangulo\n");
			lado2=leer.nextFloat();
			area= (lado1 * lado1)/2;
			System.out.println("El area es "+area);
			break;
		}
		case 4:
		{
			double radio=0;
			System.out.println("ingresa el radio del circulo\n");
			radio=leer.nextDouble();
			area=(float) (Math.PI*Math.pow(radio,2)); 
			System.out.println("El area es "+area);

			break;
		}
		}


	}
}
