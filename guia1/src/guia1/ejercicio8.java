package guia1;

import java.util.Scanner;

public class ejercicio8 {
	
	static Scanner scan;
	static int dimension = 100;
	static int [] arreglo = new int [dimension];

	public static int ArregloNumeros(int[]numeros,int dimen)
	{
		int validos = 0;
		String control ="s";
		int numero = 0;
		scan = new Scanner(System.in);
		
		while(control.equals("s") && validos<=dimen)
		{
			System.out.println("ingrese un numero");
			numero = scan.nextInt();
			arreglo[validos] = numero;
			validos++;
			
			System.out.println("Desea continuar s/n");
			control=scan.next();
		}
	    return validos;
	}
	
	public static int cantidadNumerosPositivos(int []numeros,int validos)
	{
		int cantidad = 0;
		
		for(int i = 0;i<validos;i++)
		{
			if(numeros[i]>0)
			{
				cantidad++;
			}
		}
		return cantidad;
	}
	
	public static void resolucionEjer8()
	{
		int validos = ejercicio8.ArregloNumeros(arreglo, dimension);
		int cantidad = ejercicio8.cantidadNumerosPositivos(arreglo,validos);
		System.out.println("Cantidad de numeros positivos: " + cantidad);
	}
}
