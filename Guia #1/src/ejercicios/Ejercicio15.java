package ejercicios;

import java.util.Scanner;

public class Ejercicio15 {
	static Scanner scan;
public static void farenheit(){
	
scan = new Scanner(System.in);
int celsius;

System.out.println("ingrese los grados a transformar");
celsius=scan.nextInt();
	System.out.println("F = "+celsiusAFarenheit(celsius));
}

	public static int celsiusAFarenheit(int C)
	{
	int F;
	F = 32 + ( 9 * C / 5);
	return F;
	}
}
