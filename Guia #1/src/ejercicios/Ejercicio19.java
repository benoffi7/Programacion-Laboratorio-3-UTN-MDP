package ejercicios;

import java.util.Scanner;

public class Ejercicio19 {
	static Scanner scan;
	
public static void clima()
{

	scan = new Scanner(System.in);
	int[] dia = new int[30]; 
	
	for (int i = 0; i < 30; i++){
		System.out.println("ingrese la temperatura del dia ");
		dia[i]=scan.nextInt();
	}

	int maximo = dia[0]; 
	int minimo = dia[0]; 
	int acumular=0;
	
	for (int i = 0; i < 30; i++){
		if (maximo < dia[i])
		{
			maximo = dia[i];
		}
		if (minimo > dia[i])
		{
			minimo = dia[i];
		}
		acumular=acumular +dia[i];
	}
}
}
