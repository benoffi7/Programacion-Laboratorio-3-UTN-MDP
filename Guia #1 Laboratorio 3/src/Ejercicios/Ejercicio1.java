package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	public static Scanner scan;

	public static int cargarArray(int a[], int val) {
		scan = new Scanner(System.in);
		boolean flag = true;
		String control = new String("s");
		while (val < a.length && flag) {
			System.out.println("Ingrese un numero");
			a[val] = scan.nextInt();
			val++;
			System.out.println("Desea continuar s/n");
			control = scan.next();
			if (control.equals("n")) {

				flag = false;
			}
		}

		return val;

	}
	public static float promedioArray (int a[], int val) {
		int acumulador=0;
		float promedio=0;
		for(int i=0;i<val;i++) {
			acumulador+= a[i];
		}
		promedio= acumulador/val;
		return promedio;
	}
}