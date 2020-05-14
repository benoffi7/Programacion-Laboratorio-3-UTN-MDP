package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Cateto 1:");
		float cat1 = scan.nextFloat();
		System.out.println("Cateto 2:");
		float cat2 = scan.nextFloat();
		scan.close();
		
		float hipo = pitagoras (cat1,cat2);
		System.out.println("La hipotenusa es igual a " + hipo);
	}
	
	public static float pitagoras (float cat1, float cat2) {
		
		float hipo;
		hipo = (float)Math.sqrt((Math.pow(cat1, 2))+(Math.pow(cat2, 2)));
				
		return hipo;
	}

}
