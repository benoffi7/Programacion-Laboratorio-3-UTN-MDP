package app;
import java.util.Scanner;

public class Ejercicio1Arreglos {
	
	public static int tamanio= 5;
	static int[] arregloEntero = new int[tamanio];
	static Scanner scan;
	
	public static void ScanearArrayInt(int[] arreglito, int tamanio)
	{
		int i = 0;
		scan = new Scanner(System.in);
		while(i<tamanio)
		{
			System.out.print("ingrese numero: ");
			//arregloEntero[i] = scan.nextInt();
			arreglito[i] = scan.nextInt();
			i++;
		}
	}
	
	public static void MostrarArrayInt()
	{
		/*for(i=0; i<tamanio; i++)
		{
			System.out.println(arregloEntero[i]);
		}*/
		
		int i =0;
		while(i<tamanio) 
		{
			System.out.println(arregloEntero[i]);
			i++;
		}
	}
	
	public static int SumarArreglo()
	{
		int suma =0,i;
		for(i=0; i<tamanio; i++)
		{
			suma +=  arregloEntero[i];
		}
		return suma;		
	}
	
	public static int ContarArreglo()
	{
		int contar =0,i;
		for(i=0; i<tamanio; i++)
		{
			contar ++;
		}
		return contar;
	}
	
	public static float PromedioArreglo()
	{
		float promedio = (float)SumarArreglo()/ (float)ContarArreglo();
		return promedio;
	}
	
	public static void Punto1()	{
		ScanearArrayInt(arregloEntero, tamanio);
		MostrarArrayInt();
		float promedio = PromedioArreglo();
		System.out.print("el promedio es: " +promedio);
	}
}
