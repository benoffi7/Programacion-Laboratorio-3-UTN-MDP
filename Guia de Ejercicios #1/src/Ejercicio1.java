
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Ejercicio1A();
		Ejercicio1B();

	}

	public static void Ejercicio1A() {
		int Array[] = { 1, 2, 3, 4, 5 };
		float promedio = 0;
		int suma = 0, cantidad = 0;

		cantidad = Array.length;
		for (int i = 0; i < cantidad; i++) {
			suma = suma + Array[i];
		}
		promedio = suma / cantidad;
		System.out.println("El promedio es: " + promedio);
	}

	public static void Ejercicio1B() {
		int Array[] = new int[100];
		float promedio = 0;
		int suma = 0, cantidad = 0, i = 0;
		String control = "si";
		Scanner scan = new Scanner(System.in);

		while (control.equalsIgnoreCase("si")) {
			System.out.println("Cargue un numero: ");
			Array[i] = scan.nextInt();
			i++;
			System.out.println("Desea continuar?(si/no)");
			control = scan.next();
		}
		cantidad = i;
		i = 0;
		System.out.println("\nLos numero del arreglo son los siguientes:");
		while (i < cantidad) {
			System.out.println("" + Array[i]);
			suma = suma + Array[i];
			i++;
		}
		promedio = suma / cantidad;
		System.out.println("\nSu promedio es: " + promedio);
		scan.close();
	}

}
