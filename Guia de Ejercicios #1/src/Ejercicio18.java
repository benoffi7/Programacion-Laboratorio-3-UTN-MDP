import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double cateto1 = 0, cateto2 = 0;
		System.out.println("Ingrese el valor del primer cateto: ");
		cateto1 = scan.nextDouble();
		System.out.println("Ingrese el valor del segundo cateto: ");
		cateto2 = scan.nextDouble();
		System.out.println("El valor de la hipotenusa es: " + Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2)));
		scan.close();
	}

}
