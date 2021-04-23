package guia1;

import java.util.Scanner;

public class Ejercicio11 {
	public static void multiplicar2Numeros()
	{
		int num1=0, num2=0;
		Scanner leer= new Scanner(System.in);
		System.out.println("ingresa el primer numero\n");
		num1=leer.nextInt();
		System.out.println("ingresa el segundo numero\n");
		num2=leer.nextInt();
		num1=num1*num2;
		System.out.println("El resultado de la multiplicacion es " +num1+"\n");

	}
}
