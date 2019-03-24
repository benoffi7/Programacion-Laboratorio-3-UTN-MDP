package tareaxd;

import java.util.Scanner;

public class Ejercicio6 {
	public static Scanner scan;

	public static boolean primoControl(int i) // return true si es primo, false en caso contrario
	{
		boolean flag = true;
		for (int d = 2; flag == true && d <= (int) Math.sqrt(i); d++)

		{
			if (i % d == 0) {
				flag = false;
			}
		}
		if (i <= 2) {
			flag = false;
		}
		return flag;
	}

	public static void primoControlMuestra() {
		scan = new Scanner(System.in);
		int num = 0;
		System.out.println("Ingrese un numero para saber si es primo:");
		num = scan.nextInt();
		if (primoControl(num)) {
			System.out.println(num + " es un numero primo!");
		} else {
			System.out.println(num + " no es un numero primo.");
		}
	}
}
