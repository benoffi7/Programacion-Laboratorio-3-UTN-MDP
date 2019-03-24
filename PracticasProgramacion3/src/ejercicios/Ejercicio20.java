package ejercicios;

public class Ejercicio20 {
	public static void diaLaboral (String dia) {
		switch (dia) {
		case "lunes":
			System.out.println("Lunes, dia laboral.... Odio los lunes");
		break;
		case "martes":
			System.out.println("Martes, dia laboral");
		break;
		case "miercoles":
			System.out.println("Miercoles, dia laboral");
		break;
		case "jueves":
			System.out.println("Jueves, dia laboral");
		break;
		case "viernes":
			System.out.println("Viernes, dia laboral. Pero es Viernes y tu cuerpo lo sabe!");
		break;
		case "sabado":
			System.out.println("Sabado, dia no laboral");
		break;
		case "domingo":
			System.out.println("Domingo, dia no laboral. PORQUE DURA TAN POCO EL FINDE!");
		break;
		default:
			System.out.println("Dia inexistente, si escribiste 'osvaldo' todos queremos un dia extra no laboral ");
		break;
		}
	}
}
