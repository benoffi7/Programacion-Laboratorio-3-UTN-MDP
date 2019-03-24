package guia1;

import java.util.Scanner;

public class Ejercicio_1 
{
	
	public static void promedio_arregloCargado()
	{
		int[] arreglo1 = {100, 200, 300, 400, 500} ; //creo e inicializo un arreglo
		int suma;
		float promedio;
		for (int i=0; i<arreglo1.length; i++)  //utilizo un for para recorrer el arreglo y realizar la suma
		{
			suma= arreglo1[i]; //aqui se reliza la suma
		}
		promedio = suma/arreglo1.length;  //realizo la division del total por la cant de elementos del arreglo, y guardo el resultado 
		System.out.println("El promedio es:" + promedio);
	}
	
	public static void promedio_arregloCargaUsuario()
	{
		Scanner scan= new Scanner (System.in);
		int[] arreglo2= new int[5];  //creo un arreglo de dimension 5
		int suma;
		float promedio;
		for (int i=0; i<=5; i++)
		{
			System.out.println ("Ingrese un numero:"); //pido al usuario que lo cargue
			int num = scan.nextInt();  //guardo valores
			suma= arreglo2[i];  //realizo la suma
		}
		scan.close();
		promedio = suma/i; //calculo el promedio 
		System.out.println("El promedio es:" + promedio);
	}
}
