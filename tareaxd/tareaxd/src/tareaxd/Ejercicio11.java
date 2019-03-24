package tareaxd;

import java.util.Scanner;

public class Ejercicio11 {
	public static Scanner scan;
public static int multAxB(int a, int b) {
	return a * b;
}
public static void multAxBMuestra() {
	scan = new Scanner(System.in);
	int num1=0;
	int num2=0;
	int res=0;
	System.out.println("Multiplicacion de 2 numeros, ingrese el primero:");
	num1=scan.nextInt();
	System.out.println("Ingrese el segundo numero:");
	num2=scan.nextInt();
	res=multAxB(num1, num2);
	System.out.println("El resultado de "+num1+" * "+num2+" es: "+res);
}
}
