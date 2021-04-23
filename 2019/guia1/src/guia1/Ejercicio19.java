package guia1;

import java.util.Scanner;

public class Ejercicio19 {
	public static void calcularTemperaturas()
	{
		int arreglo[]= new int[30];
		int i=0,min=0,max=0;
		float prom=0;
		Scanner leer=new Scanner(System.in);
		for(i=0;i<arreglo.length;i++)
		{
			System.out.println("Ingrese la temperatura");
			arreglo[i]=leer.nextInt();
		}
		min=max=arreglo[0];
		for(i=0;i<arreglo.length;i++)
		{
			prom=prom+arreglo[i];
			if(min>arreglo[i])
			{
				min=arreglo[i];
			}
			if(max<arreglo[i])
			{
				max=arreglo[i];
			}
		}
		prom=prom/arreglo.length;
		System.out.println("El minimo es "+min+"\nEl maximo es "+max+"\nEl promedio es "+prom);

	}
}
