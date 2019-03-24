package tareaxd;

import java.util.Scanner;

public class Ejercicio9 {
	public static Scanner scan;
//Devuelve true si es bisiesto, false si no lo es
public static boolean bisiestoControl(int ano) {
	boolean bis=true;
	if(ano%4!=0) {
		bis=false;
	}
	return bis;
}
public static void bisiestoControlMuestra() {
	scan = new Scanner(System.in);
	int num=0;
	System.out.println("Ingrese un año para ver si es bisiesto:");
	num=scan.nextInt();
	if(bisiestoControl(num)) {
		System.out.println("Ese año es bisiesto!");
	}
	else {
		System.out.println("Ese año no es bisiesto.");
	}
}
}
