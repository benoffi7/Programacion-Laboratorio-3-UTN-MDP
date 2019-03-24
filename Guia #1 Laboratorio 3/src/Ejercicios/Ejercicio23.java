package Ejercicios;

import java.util.Scanner;


public class Ejercicio23 {
	public static Scanner scan;

	public static void menuCalculadora (String opcion) {
		scan = new Scanner(System.in);
		switch (opcion) {
		
		case "+":
			int num1Suma=0, num2Suma=0, rtaSuma=0;
			System.out.println("Ingrese los números que desea sumar: ");
			System.out.println("Primer número: ");
			num1Suma=scan.nextInt();
			System.out.println("Segundo número: ");
			num2Suma=scan.nextInt();
			rtaSuma=num1Suma+num2Suma;
			System.out.println(num1Suma + " + " + num2Suma + " = " + rtaSuma);
			break;
			
		case "-":
			int num1Resta=0, num2Resta=0, rtaResta=0;
			System.out.println("Ingrese los números que desea restar: ");
			System.out.println("Primer número: ");
			num1Resta=scan.nextInt();
			System.out.println("Segundo número: ");
			num2Resta=scan.nextInt();
			rtaResta=num1Resta-num2Resta;
			System.out.println(num1Resta + " - " + num2Resta + " = " + rtaResta);
			break;
			
		case "*":
			int num1Multiplicacion=0, num2Multiplicacion=0, rtaMultiplicacion=0;
			System.out.println("Ingrese los números que desea multiplicar: ");
			System.out.println("Primer número: ");
			num1Multiplicacion=scan.nextInt();
			System.out.println("Segundo número: ");
			num2Multiplicacion=scan.nextInt();
			rtaMultiplicacion=num1Multiplicacion*num2Multiplicacion;
			System.out.println(num1Multiplicacion + " * " + num2Multiplicacion + " = " + rtaMultiplicacion);
			break;
			
		case "/":
			float num1Division=0, num2Division=0, rtaDivision=0; 
			System.out.println("Ingrese los números que desea dividir: ");
			System.out.println("Primer número: ");
			num1Division=scan.nextInt();
			System.out.println("Segundo número: ");
			num2Division=scan.nextInt();
			rtaDivision=(float) (num1Division/num2Division);
			System.out.println(num1Division + " / " + num2Division + " = " + rtaDivision);
			break;
			
		case "^":
			int num1Potencia=0, num2Potencia=0, rtaPotencia=0;
			System.out.println("Ingrese el número que desea utilizar como base: ");
			num1Potencia=scan.nextInt();
			System.out.println("Ingrese el número que desea utilizar como exponente: ");
			num2Potencia=scan.nextInt();
			rtaPotencia= (int) Math.pow(num1Potencia, num2Potencia);
			System.out.println(num1Potencia + " ^ " + num2Potencia + " = " + rtaPotencia);
			break;
			
		case "%":
			int num1Mod=0, num2Mod=0, rtaMod=0;
			System.out.println("Ingrese los números de los cuales desea saber el resto de la división entre los mismos: ");
			System.out.println("Primer número: ");
			num1Mod=scan.nextInt();
			System.out.println("Segundo número: ");
			num2Mod=scan.nextInt();
			rtaMod=num1Mod%num2Mod;
			System.out.println(num1Mod + " % " + num2Mod + " = " + rtaMod);
			break;
			
		default:
			System.out.println("Opción inválida.");
			System.out.println("Ingrese una opción nuevamente: ");
			opcion=scan.next();
			Ejercicio23.menuCalculadora(opcion);
			break;
		
		}
	}
}
