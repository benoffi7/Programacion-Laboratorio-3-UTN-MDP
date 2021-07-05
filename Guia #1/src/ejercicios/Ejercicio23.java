package ejercicios;

import java.util.Scanner;

public class Ejercicio23 {
	static Scanner scan;
	public static void CalculadoraPolacaInversaApp()
	{
		 scan = new Scanner(System.in);
		 int operando1, operando2, resultado=0;
		 String signo;
		 System.out.println("ingrese un numero");
		 operando1=scan.nextInt();
		 System.out.println("ingrese un numero");
		 operando2=scan.nextInt();
		 System.out.println("Que operacion aritmetica desea realizar?");
		 signo=scan.next();
		 switch(signo)
		 {
		 case "+":
		 {
			resultado=operando1+operando2;
			 break;
		 }
		 case "-":
		 {
			resultado=operando1-operando2;
			 break;
		 }
		 case "*":
		 {
			 resultado=operando1*operando2;
			 break;
		 }
		 case "/":
		 {
			 resultado=operando1/operando2;
			 break;
		 }
		 case "^":
		 {
			 resultado=(int) Math.pow(operando1, operando2);
			 break;
		 }
		 case "%":
		 {
			 resultado= operando1%operando2;
			 break;
		 }
}
		 System.out.println(resultado);
}
	}