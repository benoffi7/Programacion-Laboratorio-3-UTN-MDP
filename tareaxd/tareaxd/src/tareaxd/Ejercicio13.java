package tareaxd;

import java.util.Scanner;

public class Ejercicio13 {
	public static Scanner scan;
public static void saludarUsuario() {
	scan = new Scanner(System.in);
	String nombre=" ";
	System.out.println("Ingrese su nombre:");
	nombre=scan.next();
	System.out.println("Buenos dias "+ nombre);
}
}
