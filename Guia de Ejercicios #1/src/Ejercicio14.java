import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		System.out.println("Ingrese un numero entero: ");
		numero = scan.nextInt();
		System.out.println("El doble de ese numero es " + numero * 2);
		System.out.println("El triple de ese numero es " + numero * 3);
		scan.close();
	}

}
