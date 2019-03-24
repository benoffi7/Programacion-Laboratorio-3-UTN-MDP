package ejercicios;

public class Ejercicio11 {
	//Placeholder y posible respuesta al mismo tiempo
	public static void preguntarQueAreaCalcular (int opcion) {
		switch (opcion) {
		case 1:
			System.out.println("para sacar el area de un rectacngulo es: su base por su altura");
		break;
		case 2:
			System.out.println("para sacar el area de un cuadrado es: lado al cuadrado");
		break;
		case 3:
			System.out.println("para sacar el area de un triangulo es: (base por altura) dividido dos");
		break;
		case 4:
			System.out.println("para sacar el area de circulo es: Pi por radio al cuadrado ");
		break;
		default:
			System.out.println("Error: opcion no dentro de los parametros");
		;
		}
	}
}
