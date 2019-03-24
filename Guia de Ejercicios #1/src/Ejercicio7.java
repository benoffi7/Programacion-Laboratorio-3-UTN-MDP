import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		float Array[] = new float[1000];
		String control = "si";
		int i = 0, cantidad = 0;
		float suma = 0;
		while (control.equalsIgnoreCase("si")) {
			System.out.println("Cargue un numero: ");
			Array[i] = scan.nextFloat();
			System.out.println("Desea continuar?(si/no)");
			control = scan.next();
			i++;
		}
		i = cantidad;
		for (i = 0; i < 10; i++) {
			if ((Array[i] > 0) && (Array[i] % 1 == 0)) {
				suma = suma + Array[i];
			}
		}
		System.out.println("La suma de los primeros 10 numeros naturales es " + suma);
		scan.close();
	}

}
