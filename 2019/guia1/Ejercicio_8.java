package guia1;

import java.util.Scanner;

public class Ejercicio_8 
{
	public static void sumar_Numeros ()
	{
		Scanner scan= new Scanner (System.in);
		int num, cant=0;
		char control ='s';
		
		do         
		{
			System.out.println("Ingrese un numero: ");  
			int num = scan.nextInt();     //la variable num se sobreescribirá debido a que no me interesa guardarlos
			if (num>0)
			{
				cant++;  //suma una unidad por cada numero guardado				
			}
			
			System.out.println("Desea ingresar otro?: ");
			char control = scan.next().charAt(0);
			
		}while (control=='s');
		scan.close();
		
		System.out.println("La cantidad de numeros ingresados es de:" + cant);
	}
	
}
