package tareaxd;

import java.util.Scanner;

public class Ejercicio8 {
	public static Scanner scan;

	// cuenta y devuelve cantidad de numeros positivos ingresados
	public static int cantNumPosIngresados() {
		boolean flag = true;
		int cont = 0;
		while (flag == true) {
			System.out.println("Ingrese numeros, se contaran los positivos: ");
			if (scan.nextInt() > 0) {
				cont++;
			}
			System.out.println("desea ingresar mas numeros? s/n");
			if ("n".equals(scan.next())) {
				flag = false;
			}

		}
		return cont;
	}
public static void cantNumPosIngresadosMuestra() {
	scan = new Scanner(System.in);
	int cant=0;
	cant=cantNumPosIngresados();
	if(cant>1) {
	System.out.println("Se ingresaron numeros "+cant +" positivos.");
	}
	if(cant==1) {
		System.out.println("Se ingreso un numero positivo.");
	}
	if(cant==0) {
		System.out.println("No se ingresaron numeros positivos.");
	}
	}
}