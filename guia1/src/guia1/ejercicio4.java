package guia1;

import java.util.Scanner;

public class ejercicio4 {

	static Scanner scan;
	
	public static void nNumerosPrimos() {
		
		int cantidad = 0;
		scan = new Scanner(System.in);
		System.out.println("ingrese cantidad de numeros primos que desea mostrar: ");
	    cantidad=scan.nextInt();
	    
	    for(int i=2;i<=cantidad;i++)
	    {
	    	if(ejercicio3.esPrimo(i))
	    	{
	    		System.out.println(i);
	    	}else {
	    		cantidad++;
	    	}
	    	
	    }
	}
}
