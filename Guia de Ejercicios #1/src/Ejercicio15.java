import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		float tempFahrenheit = 0;

		System.out.println("Ingrese la temperatura en °C: ");
		tempFahrenheit = 32 + (9 * scan.nextFloat() / 5);
		System.out.println("La temperatura convertida a °F es: " + tempFahrenheit);
		scan.close();
	}

}
