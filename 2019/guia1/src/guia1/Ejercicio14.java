package guia1;

import java.util.Scanner;

public class Ejercicio14 {
	public static  void calcularDobleTriple()
	{
		int num=0,doble=0,triple=0;
		Scanner leer= new Scanner(System.in);
		System.out.println("Ingrese un numero");
		num=leer.nextInt();
		doble=num*2;
		triple=num*3;
		System.out.println("El doble es "+doble+"\nEl triple es "+triple);
	}
}
