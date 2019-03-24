package tareaxd;

import java.util.Scanner;

public class Ejercicio21 {
	public static Scanner scan;

	public static void preguntarDiaHabil() {
		scan = new Scanner(System.in);
		boolean flag = true;
		String opcion = " ";

		while (flag == true) {
			System.out.println("Ingrese un dia de la semana y se le dira si es habil o no");
			opcion = scan.next();
			opcion = opcion.toLowerCase();
			switch (opcion) {
			/*
			 * Estoy casi seguro de que hay una mejor forma de hacer que se repita  el switch si se
			 * puso una opcion incorrecta pero no pude darme cuenta asi que use distintos flags
			 */
			case "domingo":
				System.out.println("El dia " + opcion + " no es un dia habil.");
				flag = false;
				break;
			case "lunes":
				System.out.println("El dia " + opcion + " es un dia habil.");
				flag = false;
				break;

			case "martes":
				System.out.println("El dia " + opcion + " es un dia habil.");
				flag = false;
				break;

			case "miercoles":
				System.out.println("El dia " + opcion + " es un dia habil.");
				flag = false;
				break;

			case "jueves":
				System.out.println("El dia " + opcion + " es un dia habil.");
				flag = false;
				break;

			case "viernes":
				System.out.println("El dia " + opcion + " es un dia habil.");
				flag = false;
				break;

			case "sabado":
				System.out.println("El dia " + opcion + " no es un dia habil.");
				flag = false;
				break;

			default:
				System.out.println("Opcion incorrecta, ingrese un dia nuevamente: ");
				break;

			}
		}
	}
}
