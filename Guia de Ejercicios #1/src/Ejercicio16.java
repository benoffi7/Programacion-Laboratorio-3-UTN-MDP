import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double radio = 0, longitud = 0, area = 0;

		System.out.println("Ingrese el radio de una circunferencia: ");
		radio = scan.nextDouble();
		longitud = 2 * Math.PI * radio;
		area = Math.PI * Math.pow(radio, 2);
		System.out.println("La longitud de la circunferencia es " + longitud + " y el area es " + area);
		scan.close();
	}
}
