package paquete;

import java.util.Scanner;

public class Main {

	public static void generarNrosAleatorios ()
	{
		int cantNrosAleatorios = 10;
		int num1 = 0;
		int num2 = 0;
		Scanner scan = new Scanner (System.in);
		System.out.print("Ingrese un numero: ");
		num1 = scan.nextInt();
		System.out.print("Ingrese otro numero: ");
		num2 = scan.nextInt();
		scan.close();
		if (num1>num2)
		{
			int aux = num1;
			num1 = num2;
			num2 = aux;
		}
		for (int i=0; i<cantNrosAleatorios; i++)
		{
			int nroAleatorio = (int) Math.floor(Math.random()*(num2-num1+1)+num1);
			System.out.println(nroAleatorio);
		}
	}
	public static void main(String[] args) {
		generarNrosAleatorios();
	}

}
