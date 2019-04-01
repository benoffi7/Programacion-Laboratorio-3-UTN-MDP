package tp1;
import java.util.Scanner;

public class Ej2 {

	public static void menu (Scanner scan) {
		System.out.println("Ejercicio nº2: Calcular si un número es par o no");
		System.out.println("Ingrese un numero");
		int numero = scan.nextInt();
	     par(numero);
	     
	}
	
	public static void par(int numero) {
		int comparar = numero%2;
		if(comparar == 0)
			System.out.println("El numero es Par");
		else
			System.out.println("El numero es Impar");
	}
}
