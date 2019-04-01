package tp1;

import java.util.Arrays;

public class Ej18 {
	public static void menu () {
		System.out.println("Ejercicio nº19: Programa lea 30 temperaturas correspondientes a un mes y\r\n" + 
				"calcule el maximo, el minimo y el promedio.\r\n");
		double max,min,prom;
		double[] temperaturas = new double[] {20,15,12,33,40,-1};
		max = Arrays.stream(temperaturas).max().getAsDouble();
		min = Arrays.stream(temperaturas).min().getAsDouble();
		prom =Arrays.stream(temperaturas).average().getAsDouble();
		try 
		{
			System.out.println("El Maximo es : "+max+ "\r\n"+"El Minimo es : "+min+"\r\n"+"El promedio es : "+prom);
			Thread.sleep(3000);
		} 
		catch(InterruptedException ex) 
		{
			Thread.currentThread().interrupt();
		}
	}
	
}
