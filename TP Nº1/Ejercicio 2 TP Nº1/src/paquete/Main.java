package paquete;

import java.util.Scanner;

public class Main {

	public static int pedirNumComprobacion ()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el numero a comprobar si es par o no:");
		int num = scan.nextInt();
		scan.close();
		return num;
	}
	public static boolean numPar (int num)
	{
		boolean control=false;
		int comprobarPar = num%2;  
		if (comprobarPar==0)
			control=true;
		return control;			
	}							
	public static void main(String[] args) {
		int num = pedirNumComprobacion();
		System.out.println(" ");
		if (numPar(num))
			System.out.println("El numero " + num + " es par.");
		else
			System.out.println("El numero " + num + " no es par.");
	}

}
