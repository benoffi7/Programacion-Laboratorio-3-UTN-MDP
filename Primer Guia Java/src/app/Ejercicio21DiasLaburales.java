package app;
import java.util.Scanner;

public class Ejercicio21DiasLaburales {
	
	static Scanner scan;
	
	public static void DiasLaburales() {
		
		scan = new Scanner(System.in);
		System.out.print("\nIngrese un dia de la semana: ");
		String dia =  scan.next();
		
		switch(dia)
		{
			 case "lunes": System.out.print("\nEl dia es laboral.");
				 break;
				 
			 case "martes": System.out.print("\nEl dia es laboral.");
				 break;
				 
			 case "miercoles": System.out.print("\nEl dia es laboral.");
				 break;
				 
			 case "jueves": System.out.print("\nEl dia es laboral.");
				 break;
				 
			 case "viernes": System.out.print("\nEl dia es laboral.");
				 break;
			
			 case "sabado": System.out.print("\nEl dia No es laboral.");
				 break;
				 
			 case "domingo": System.out.print("\nEl dia NO es laboral.");
				 break;
				 
			default: System.out.print("\nEl dia ingresado NO es valido.");
				break;		
		}		
	}
}
