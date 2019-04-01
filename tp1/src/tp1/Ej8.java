package tp1;

import java.util.Scanner;

public class Ej8 {
	public static void menu(Scanner scan) {
		System.out.println("Ejercicio nº8: Revisar si un año es bisiesto o no.\r\n");
		int anio = Integer.parseInt(scan.next());
		boolean bisiesto = bisiesto(anio);
		if(bisiesto)
			System.out.println("El anio "+ anio +" es bisiesto");
		else
			System.out.println("El anio "+ anio +" no es bisiesto");
		try        
		{
		    Thread.sleep(3000);
		} 
		catch(InterruptedException ex) 
		{
		    Thread.currentThread().interrupt();
		}
		
	}
	
	public static boolean bisiesto(int anio) {
		boolean resultado = false;
		if((anio % 4 == 0)&&(anio %100 != 0 || anio % 400 == 0))
			resultado = true;
		return resultado;
	}
}
