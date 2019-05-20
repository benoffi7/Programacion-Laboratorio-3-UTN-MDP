package paquete;

import java.util.Scanner;

public class Main {

	public static float longitudHipotenusa ()
	{
		Scanner scan = new Scanner (System.in);
		System.out.print("Ingrese el valor de uno de los catetos del triangulo rectangulo: ");
		float cateto1 = scan.nextFloat();
		System.out.print("Ingrese el valor del otro cateto: ");
		float cateto2 = scan.nextFloat();
		float hipotenusa = (float) Math.sqrt(( (float) Math.pow(cateto1, 2) + (float) Math.pow(cateto2, 2)));
		scan.close();
		return hipotenusa;
	}
	public static void main(String[] args) {
		System.out.println("\nLa hipotenusa del triangulo rectangulo es: " + longitudHipotenusa());
	}

}
