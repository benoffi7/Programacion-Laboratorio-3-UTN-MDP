import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double velocidadKM = 0;
		velocidadKM = scan.nextDouble();
		System.out.println("Velocidad en km/h: " + velocidadKM + " Velocidad en m/s: " + velocidadKM / 3.6);
		scan.close();
	}

}
