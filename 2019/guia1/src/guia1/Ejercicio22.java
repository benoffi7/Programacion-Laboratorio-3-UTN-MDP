package guia1;

import java.util.Scanner;

public class Ejercicio22 {
	public static void calcularDigitos()
	{
		int num=0;
		boolean positivo = false;
		Scanner leer= new Scanner(System.in);
        do
        {
            System.out.println("Ingrese un numero positivo");
        	num=leer.nextInt();
        	if(num>0)
        	{
        		positivo=true;
        	}
        }while(positivo);
		
        System.out.println("El número " + num + " tiene " + Integer.toString(num).length() + " dígitos");

	}
}
