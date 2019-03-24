package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Nombre:");
		String nombre = scan.next();
		System.out.println("Edad:");
		int edad = scan.nextInt();
		System.out.println("Salario:");
		float salario = scan.nextFloat();
		scan.close();
		
		calcularSalario (nombre,edad,salario);
	}
	
	public static void calcularSalario (String nombre, int edad, float salario) {
		
		if (edad<16) {
			System.out.println("No tiene edad suficiente para trabajar");
		}else {
			if ((edad>=19)&&(edad<=50)) {
				salario = salario + ((salario*5)/100);
				System.out.println("El salario de " + nombre + " es " + salario);
			}else {
				if ((edad>=51)&&(edad<=60)) {
					salario = salario + ((salario*10)/100);
					System.out.println("El salario de " + nombre + " es " + salario);
				}else {
					if (edad>60) {
						salario = salario + ((salario*15)/100);
						System.out.println("El salario de " + nombre + " es " + salario);
					}
				}
			}
		}
	}

}
