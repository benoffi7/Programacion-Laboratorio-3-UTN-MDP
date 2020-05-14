package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		iniciarCalculadoraInversaPolacaApp();
	}
	
	public static void iniciarCalculadoraInversaPolacaApp() {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Primer numero:");
		int num1 = scan.nextInt();
		System.out.println("Segundo numero:");
		int num2 = scan.nextInt();
		
		System.out.println("Ingrese que operacion desea realizar (+,-,*,/,^,%):");
		String op = scan.next();
		scan.close();
		
		realizarCuenta (num1,num2,op);	
	}
	
	public static void realizarCuenta (int num1, int num2, String op) {
		
		int res;
		double resDouble;
		
		switch (op) {
			case "+": res=num1+num2;
			System.out.println("El resultado es " + res);break;
			case "-": res=num1-num2;
			System.out.println("El resultado es " + res);break;
			case "*": res=num1*num2;
			System.out.println("El resultado es " + res);break;
			case "/": resDouble=(double)num1/(double)num2;
			System.out.println("El resultado es " + resDouble);break;
			case "^": resDouble=Math.pow(num1, num2);
			System.out.println("El resultado es " + resDouble);break;
			case "%": res=num1%num2;
			System.out.println("El resultado es " + res);break;
			default: System.out.println("Error");
		}
	}

}
