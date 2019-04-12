package guia1;

import java.util.Scanner;

public class ejercicio1 {

	static Scanner scan;
	static int dimension=5;
	static int [] arreglo = new int [dimension];
	
	public static void cargarArreglo()
	{
		int i;
		scan = new Scanner(System.in);

		for(i=0;i<dimension;i++)
		{
		    System.out.println("ingrese un entero: ");
			arreglo[i]=scan.nextInt();	
		}
		
	}
	
	public static int sumarArreglo()
	{
		int i;
		int suma=0;
		
		for(i=0;i<dimension;i++)
		{
			suma += arreglo[i];
		}
		return suma;
	}
	
	public static int contarArreglo()

	{
		int i;
		int contador=0;
		
		for(i=0;i<dimension;i++)
		{
			contador++;
		}
		return contador;
	}

	public static float promedioArreglo()
	{
		float promedio =(float)sumarArreglo()/(float)contarArreglo();
		return promedio;
	}

    public static void resolucionEjer1()
    {
    	ejercicio1.cargarArreglo();
		float promedio = promedioArreglo();
		System.out.println("el promedio es de: "+promedio);
    }
    
}
