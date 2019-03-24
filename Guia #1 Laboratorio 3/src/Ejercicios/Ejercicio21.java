package Ejercicios;

public class Ejercicio21 {

	public static void menuDiaLaboral(String dia) {
		switch (dia) {

		case "lunes":
			System.out.println("Día laboral");
			break;
		case "martes":
			System.out.println("Día laboral");
			break;
		case "miercoles":
			System.out.println("Día laboral");
			break;
		case "jueves":
			System.out.println("Día laboral");
			break;
		case "viernes":
			System.out.println("Día laboral");
			break;
		case "sabado":
			System.out.println("Día no laboral");
			break;
		case "domingo":
			System.out.println("Día no laboral");
			break;
		default:
			System.out.println("Día no válido");
			break;
		}
	}
}
