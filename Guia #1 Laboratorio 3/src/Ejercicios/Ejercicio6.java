package Ejercicios;

public class Ejercicio6 {

	public static boolean numPrimo(int num) {
		boolean flag = true;
		int contador = 0;
		for (int i = num; i >= 1; i--) {
			if (num % i == 0) {
				contador++;
			}
		}
		if (contador > 2) {
			flag = false;
		}
		return flag;
	}
}
