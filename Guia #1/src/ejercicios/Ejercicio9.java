package ejercicios;

import java.util.Scanner;

public class Ejercicio9{
	static Scanner scan;
	public static void añoBiciesto(){
		
	scan = new Scanner(System.in);
	
	int año=0;
	char control;
	do
		{
	System.out.println("ingrese el año a verificar");
	año=scan.nextInt();
	if(año%4==0)
	{
		System.out.println("el año es biciesto ");
	}
	else
	{
		System.out.println("el año no es biciesto");
	}
	System.out.println("Desea ingresar otro año?");
	control = scan.next().charAt(0);
		}
while (control=='s');
}
	}
