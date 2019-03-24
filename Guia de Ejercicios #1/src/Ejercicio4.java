import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Array[] = new int[1000];
		String control = "si";
		int numero, i = 0, cantidad = 0;
		while (control.equalsIgnoreCase("si")) {
			System.out.println("Cargue un numero: ");
			Array[i] = scan.nextInt();
			System.out.println("Desea continuar?(si/no)");
			control = scan.next();
			i++;
		}
		cantidad = i;
		System.out.println("Ingrese el numero limite para mostrar numeros primos: ");
		numero = scan.nextInt();
		System.out.println("La cantidad de numeros cargados es: " + cantidad);
		System.out.println("Sus numeros primos hasta el limite son:");
		for (i = 0; i < numero; i++) {
			if (((Array[i] % 2 != 0) && (Array[i] % 3 != 0)) || ((Array[i] == 2) | (Array[i] == 3)))
				System.out.println("" + Array[i]);
			if (i == cantidad)
				i = numero;
		}
		scan.close();
	}
}
