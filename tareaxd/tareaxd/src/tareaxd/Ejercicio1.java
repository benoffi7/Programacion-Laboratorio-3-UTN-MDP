package tareaxd;

import java.util.Scanner;

public class Ejercicio1 {
	public static Scanner scan;
	public static int[] a = new int[10];
//Carga un array por teclado hsata que el usuario se detenga o llegue al limite del arreglo
	public static int cargarArray(int a[], int val) {
		scan = new Scanner(System.in);
		boolean flag = true;
		String control = "s";
		while (val < a.length && flag) {
			System.out.println("Carga del arreglo, ingrese un numero");
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
//Calcula el promedio y lo devuelve del tipo float
	public static double promedioArray(int a[], int val) {
		double rta = 0;
		int suma = 0;
		for (int i = 0; i < val; i++) {
			suma += a[i];
		}
		rta = (double) suma/val;
		return rta;
	}
	public static void promedioArrayMuestra() {
		int val = 0;
		double promedio = 0;
		System.out.println("Cargue un arreglo y conozca el promedio de sus valores.");
		val =cargarArray(a, val);
		promedio = promedioArray(a, val);
		System.out.println("El promedio de los elementos del array es de: "+promedio);
	}
}
