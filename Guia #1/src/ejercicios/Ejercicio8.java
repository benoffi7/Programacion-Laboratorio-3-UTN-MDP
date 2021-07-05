package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
	
	static Scanner scan;
	
	public static void arregloPositivos()
	{
		int []arreglo=new int[100];
		scan = new Scanner(System.in);
		int i=0;
		char control;
		do
			{
		System.out.println("ingrese un numero");
		arreglo[i]=scan.nextInt();
		i++;
		System.out.println("Desea continuar?");
		control = scan.next().charAt(0);
			}
	while (control=='s');
		System.out.println(contarPositivos(arreglo,i));
		
	}
public static int contarPositivos(int array[], int dimension)
{
	int contar=0, i;
	for(i=0;i<dimension;i++)
		{
	if(array[i]>0)
	{
		contar++;
	}
		}
	return contar;
}
}
