package ejercicios;

import java.util.Scanner;


public class Ejercicio20 {
	static Scanner scan;
	public static void numerosAleatorios(){
	scan = new Scanner(System.in);
	int variable1, variable2;
	System.out.println("a continuacion ingresara dos numeros aleatorios ");
	variable1=scan.nextInt();
	variable2=scan.nextInt();
	for (int i=0;i<10;i++){
	  int valorAleatorio = (int) Math.floor(Math.random()*(variable2-variable1+1)+variable1);
	  System.out.println(valorAleatorio);
			}
	
	}	
}
