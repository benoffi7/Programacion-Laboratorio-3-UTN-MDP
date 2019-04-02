package app;
import java.util.Scanner;

public class Ejercicio19TemMes {

	static Scanner scan;
	static int tam = 30;	
	static int[] arreglo = new int[tam];
	
	public static void TemperaturasMes(){
		
		int i = 0;
		scan = new Scanner(System.in);
		//int maximo= arreglo[i], minimo= arreglo[i], promedio=0;
		
		for(i=0; i<tam; i++)
		{
			System.out.print("ingrese numero: ");
			arreglo[i] = scan.nextInt();
		}
	}
	
	public static int sumarTamperaturas() {
		
		int suma=0;
		
		for(int i=0; i< tam; i++)
		{
			suma += arreglo[i];			
		}
		return suma;
	}
	
	public static void MaximoTemp() {
		
		int i=0;
		int maximo= arreglo[i];
		
		for(i=0; i<tam; i++)
		{
			if(maximo< arreglo[i])
				maximo = arreglo[i];
		}
		System.out.print("\nLa maxima fue: "+maximo);		
	}
	
	public static void MinimoTemp() {
		
		int i=0;
		int minimo= arreglo[i];
		for(i=0; i<tam; i++)
		{
			if(minimo< arreglo[i])
				minimo = arreglo[i];
		}
		System.out.print("\nLa maxima fue: "+minimo);
	}
	
	public static int ContarTemp() {
		
		int i=0;
		while(i<tam)
		{
			i++;
		}
		//System.out.print("\nSe contaron: "+i +" temperaturas.");
		return i;
	}
	
	public static void promedioTemp() {
		
		float promedio = (float)sumarTamperaturas()/(float)ContarTemp();
		System.out.print("\nEl promedio es: "+promedio);
	}
}
