package guia1;

import java.util.Scanner;

public class Ejercicio19 {
	
	static Scanner scan;
	static int dimension = 30;
	static float maxima = 0;
	static float minima = 100;
	static float promedio = 0;
	static float [] temperatura = new float [dimension];
	
	public static void resolucionEjer19()
	{
		cargarTemperaturas();
		temperaturaMaxima();
		System.out.print("Temperatura maxima: "+maxima);
		temperaturaMinima();
		System.out.print("\nTemperatura minima: "+minima);
		temperaturaPromedio();
		System.out.print("\nTemperatura promedio: "+promedio);
	}
		
    public static void cargarTemperaturas()
	{
		int i;
		scan = new Scanner(System.in);

		for(i=0;i<dimension;i++)
		{
			System.out.println("ingrese una temperatura: ");
			temperatura[i]=scan.nextInt();	
		}
			
	}
	
    public static void temperaturaMaxima()
    {	
    	for(int i=0;i<30;i++)
    	{
    		if(temperatura[i]>maxima)
    		{
    			maxima = temperatura[i];
    		}
    	}	
    }
    
    public static void temperaturaMinima()
    { 	
    	for(int i=0;i<dimension;i++)
    	{
    		if(temperatura[i]<minima)
    		{
    			minima = temperatura[i];
    		}
    	}	
    }

    public static void temperaturaPromedio()
    { 
    	int suma = 0;
    	
    	for(int i=0;i<dimension;i++)
    	{
    	  suma +=temperatura[i];
    	}	
    	
    	promedio = suma/dimension;
    }
}
