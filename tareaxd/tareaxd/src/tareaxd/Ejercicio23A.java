package tareaxd;

import java.util.Scanner;

public class Ejercicio23A {
	public static Scanner scan;

	public static void calculadoraPolacaInversaApp() {
		scan = new Scanner(System.in);
		double operando1 = 0;
		double operando2 = 0;
		double rta = 0;
		String signo = " ";
		System.out.println("La gran calculadora Polaca espera sus pedidos.");
		boolean flag = true;
		while (flag == true) {
			System.out.println("Ingrese el primer operando:");
			operando1 = scan.nextDouble();
			System.out.println("Ingrese el segundo operando:");
			operando2 = scan.nextDouble();
			System.out.println("Ingrese la operacion a realizar ( + - * / ^ % ");
			signo = scan.next();
			switch (signo) {
			case "+":
				rta = operando1 + operando2;
				flag = false;
				break;
			case "-":
				rta =  operando1 - operando2;
				flag = false;
				break;
			case "*":
				rta = operando1 * operando2;
				flag = false;
				break;
			case "/":
				if (operando2 == 0) {
					System.out.println("La division por 0 no es posible.");
				} else {
					rta = operando1 / operando2;
					flag = false;
				}
				break;
			case "^":
				rta = Math.pow( operando1,operando2);
				flag = false;
				break;
			case "%":
				rta = operando1 % operando2;
				flag = false;
				break;
			default:
				System.out.println("Signo incorrecto, ingreselo nuevamente");
				break;
			}
			/*
			 * el bucle solo se repite en 2 casos, si el signo ingresado es incorrecto o si
			 * se queria realizar una division por 0
			 */
		}
		System.out.println(operando1 + " " + signo + " " + operando2 + " = " + rta);
	}
}
