package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num = pedirNumero ();
		System.out.println(num);
		
		int cant = calcularCifras (num);
		System.out.println("Tiene " + cant + " cifra/s");
	}
	
	public static int pedirNumero () {
		
		Scanner scan = new Scanner (System.in);
		int num;
		
		System.out.println("Ingrese un numero entero positivo");
		do {
			num = scan.nextInt();
		} while (num<1);
		scan.close();
		
		return num;
	}
	
	public static int calcularCifras (int num) {
		
		int i=1;
		
		while (num>=10) {
			num /= 10;
			i++;
		}
		
		return i;
	}

}
