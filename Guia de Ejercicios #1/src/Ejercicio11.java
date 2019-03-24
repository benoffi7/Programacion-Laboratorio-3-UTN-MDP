import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0, resultado;
		System.out.println("Ingrese el primer numero");
		num1 = scan.nextInt();
		System.out.println("Ingrese el segundo numero");
		num2 = scan.nextInt();
		resultado = num1 * num2;
		System.out.println("El resultado de la multiplicacion de ambos numeros es: " + resultado);
		scan.close();
	}

}
