package guia1;

import java.util.Scanner;

public class Ejercicio11 {
	
	static Scanner scan;
	//static int numero1,numero2;
	
	public static void multiplicarDosNumeros(int n1,int n2)
	{
		int resultado = n1 * n2;
		System.out.println(n1+" * "+n2+" = "+resultado);
	}
	
	public static void resolucionEjer11()
	{
		int numero1,numero2;
		scan = new Scanner(System.in);
		System.out.println("Ingrese el primer numero: ");
		numero1 = scan.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		numero2 = scan.nextInt();
		multiplicarDosNumeros(numero1,numero2);
	}

}
