package guia1;

import java.util.Scanner;

public class Ejercicio9 {
	public static void verificarBisiesto()
	{
		int num=0;
		Scanner leer= new Scanner(System.in);
		System.out.println("Ingresa un año\n");
		num=leer.nextInt();
		System.out.println("num es "+num);

		if(num % 4==0 && (num % 100 !=0 | num %400 ==0))
		{
			System.out.println("Es bisiesto\n");
		}
		else
		{
			System.out.println("NO es bisiesto\n");
		}
	}
}
