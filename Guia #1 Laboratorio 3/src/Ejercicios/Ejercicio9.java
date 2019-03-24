package Ejercicios;

public class Ejercicio9 {

	public static boolean anioBisiesto(int numAnio) {
		boolean flag = false;
		if (numAnio % 4 == 0) {
			flag = true;
		}
		return flag;
	}
}
