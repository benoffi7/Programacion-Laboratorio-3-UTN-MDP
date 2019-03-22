package app;

import java.util.Scanner;

public class Main 
{
	static String nombre = "gonzalo";
	static Scanner scan;//esto es una declaracion
	
	public static void main(String[] args) 
	{
		/*
		int numero = 5;
		System.out.println("el numero es "+numero);
		sumar(1, 2);
		int rta = 3;
		rta = contar();
		System.out.println("la rta es "+rta);*/
		scan = new Scanner(System.in);//esto es una instancia
		String nombre = scan.next();
		//System.out.println(nombre);
		//System.out.println(Main.nombre);
		if (Main.nombre.equals(nombre))
		{
			System.out.println("es igual!");
		}
	}

	//esta funcion suma
	/*
	 * esta funcion suma
	 */
	/**
	 * 
	 * @param n1 un numero 
	 * @param n2 otro numero
	 */
	public static void sumar(int n1, int n2)
	{
		int rta = n1 + n2;
		System.out.println("la suma es "+rta);
	}
	
	public static int contar()
	{
		return 5;
	}

}
