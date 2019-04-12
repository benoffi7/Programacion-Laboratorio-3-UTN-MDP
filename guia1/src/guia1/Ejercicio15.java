package guia1;

import java.util.Scanner;

public class Ejercicio15 {

	static Scanner scan;
	
	public static void centrigradosAfahrenheit()
	{  
		scan = new Scanner(System.in); 
		float grados;
		System.out.print("ingresar grados centigrados: ");
		grados = scan.nextFloat();
	   
	    float resultado = 32 + ( 9 * grados / 5) ;
	    System.out.print("centigrados: "+grados+"\n"+"fahrenheit: "+resultado+"\n");
	}
	
}
