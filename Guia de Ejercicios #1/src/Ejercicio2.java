import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int numero = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		numero = scan.nextInt();
		if (numero % 2 == 0)
			System.out.println("El numero es par ");
		else
			System.out.println("El numero no es par ");
		scan.close();
	}
}
