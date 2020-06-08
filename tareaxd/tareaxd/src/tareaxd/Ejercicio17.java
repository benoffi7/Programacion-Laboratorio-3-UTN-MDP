package tareaxd;

import java.util.Scanner;

public class Ejercicio17 {
	public static Scanner scan;
	//Recibe una velocidad en Km/h y devuelve su equivalente en m/s
	public static double kmhToMh(int vel) {
		return (double)vel/36/10;
	}
	public static void kmhToMhMuestra(){
		scan = new Scanner(System.in);
		int vel=0;
		double res=0;
		System.out.println("Paso de Km/h a M/s, ingrese la cantidad de Km/h");
		vel=scan.nextInt();
		res=kmhToMh(vel);
		System.out.println(vel+" Km/hs equivale a "+res+" M/s");
	}
}
