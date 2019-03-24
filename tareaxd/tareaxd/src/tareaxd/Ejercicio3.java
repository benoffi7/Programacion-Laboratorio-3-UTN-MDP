package tareaxd;

import java.util.Scanner;

public class Ejercicio3 {
	public static Scanner scan;

	// Muestra todos los numeros primos hasta N numero
	public static void primosHastaN() {
		scan = new Scanner(System.in);
		int i = 0;
		int num = 0;
		boolean flag = true;
		String primos = " ";
		while (flag == true) {
			System.out.println("Ingrese el numero hasta el cual desea conocer los numeros primos:");
			num = scan.nextInt();
			if (num < 2) {
				System.out.println("El algoritmo solo funciona con numeros mayores a 1 :)");
			}
			else {
				flag =false;
			}
		}
		flag = true;

		for (i = 2; i <= num; i++) {
			if (i % 2 != 0 || i == 2) // Esta sucesion de ifs ahorra pasos en numeros mas largos
			{
				/*
				 * Se supone que en realidad tengo que hacer esto con cada numero primo que
				 * encuentre pero no busque como ir modificando el tamaño de un arreglo
				 * automaticamente y tampoco se si tener un arreglo muy grande de numeros afecta
				 * mucho la memoria
				 */
				if (i % 3 != 0 || i == 3) {

					if (i % 5 != 0 || i == 5) {
						// Se prueban divisiones desde 2 hasta la raiz del numero
						for (int d = 2; flag == true && d <= (int) Math.sqrt(i); d++)

						{
							if (i % d == 0) {
								flag = false;
							}
						}
						if (flag == true) {
							// Guardo en un string los primos, otra forma es mostrarlo mientras los
							// encuentro
							primos = primos + i + " ";
						}
					}
				}

				flag = true; // Se devuelve el flag a su valor original por si se encontro un no-primo
			}

			System.out.println("Los numeros primos del 1 al " + num + ":");
			System.out.println(primos);
		}
	}
}
