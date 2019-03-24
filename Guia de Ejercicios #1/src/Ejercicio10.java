import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char caracter = 0;
		System.out.println("Ingrese un caracter para conocer su valor en el ASCII: ");
		caracter = scan.next().charAt(0);
		int valor = caracter;
		System.out.println("El valor del caracter igresado es: " + valor);
		scan.close();

	}

}
