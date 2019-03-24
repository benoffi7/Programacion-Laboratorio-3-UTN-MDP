package tareaxd;

import java.util.Scanner;

public class Ejercicio18 {
	public static Scanner scan;
	public static double pitagorasConCatetos(double lado1,double lado2) {
		return Math.sqrt(lado1*lado1 + lado2*lado2);
	}
	public static void pitagorasConCatetosMuestra(){
		double lado1=0;
		double lado2=0;
		double hipo=0;
		System.out.println("Calculo de la hipotenusa con los catetos, ingrese el primer cateto:");
		lado1=scan.nextDouble();
		System.out.println("Ingrese el segundo cateto");
		lado2=scan.nextDouble();
		hipo=pitagorasConCatetos(lado1, lado2);
		System.out.println("La hipotenusa de su triangulo es: "+hipo);
	}
}
