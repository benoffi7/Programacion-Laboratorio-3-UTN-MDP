import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Array[] = new int[1000];
		String control = "si";
		int i = 0;
		while (control.equalsIgnoreCase("si")) {
			System.out.println("Cargue un numero: ");
			Array[i] = scan.nextInt();
			if (((Array[i] % 2 != 0) && (Array[i] % 3 != 0)) || ((Array[i] == 2) | (Array[i] == 3)))
				System.out.println("Es primo");
			else
				System.out.println("No es primo");
			System.out.println("Desea continuar?(si/no)");
			control = scan.next();
			i++;
		}
		scan.close();

	}
}
