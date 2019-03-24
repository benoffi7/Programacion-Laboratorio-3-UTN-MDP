import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int Array[] = new int[1000];
		String control = "si";
		int i = 0, suma = 0;
		while (control.equalsIgnoreCase("si")) {
			System.out.println("Cargue un numero: ");
			Array[i] = scan.nextInt();
			if (Array[i] >= 0)
				suma++;
			System.out.println("Desea continuar?(si/no)");
			control = scan.next();
			i++;
		}
		System.out.println("La cantidad de numeros positivos cargados es: " + suma);
		scan.close();

	}

}
