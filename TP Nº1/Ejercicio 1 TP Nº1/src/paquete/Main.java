package paquete;

import java.util.Scanner;

public class Main {
	
	final static int dim = 30;

	public static float calcularProm(int [] arreglo, int validos)
	{
		int i=0;
		int suma=0;
		for (i=0;i<validos;i++)
		{
			suma += arreglo[i];
		}
		float prom = (float) suma/validos;
		return prom;
	}
	
	public static int cargarArreglo(int [] arreglo)
	{
		char control='s';
		int num;
		int i=0;
		Scanner scan = new Scanner (System.in);
		while (i<dim && (control == 's' || control == 'S'))
		{
			System.out.println("Ingrese un numero entero");
			num = scan.nextInt();
			arreglo[i]=num;
			System.out.println("Desea seguir cargando el arreglo? S/N");
			control = scan.next().charAt(0);
			i++;
			System.out.println("");
		}
		scan.close();
		return i;
	}
	public static void mostrarArreglo(int [] arreglo, int validos)
	{
		for (int i=0; i<validos; i++)
		{
			System.out.print(arreglo [i] + "  ");
		}
	}
	public static void main(String[] args) 
	{
		int [] arregloInt = {1,4,3,7,2}; 
		int [] arregloDim = new int [dim]; 
		System.out.println("Arreglo ya inicializado:");
		System.out.println("");
		mostrarArreglo(arregloInt, 5);
		float prom = calcularProm(arregloInt, 5);
		System.out.println("");
		System.out.println("\nEl promedio del arreglo ya inicializado: "+ prom);
		System.out.println("");
		System.out.println("\nCarga del arreglo por teclado...");
		System.out.println("");
		int validos=cargarArreglo(arregloDim);
		System.out.println("Arreglo cargado por teclado:");
		mostrarArreglo(arregloDim, validos);
		System.out.println("");
		prom = calcularProm(arregloDim, validos);
		System.out.println("");
		System.out.println("El promedio del arreglo cargado por teclado es: "+ prom);
	}

}
