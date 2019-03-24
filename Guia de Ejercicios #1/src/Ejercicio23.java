import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1=0,num2=0;
		float resultado=0;
		char operador;
		
		System.out.print("Ingrese el primer operando: ");
		num1=scan.nextInt();
		System.out.print("Ingrese el operador: ");
		operador=scan.next().charAt(0);
		System.out.print("Ingrese el segundo operando: ");
		num2=scan.nextInt();
		switch(operador)
		{
		case '+':
			resultado=num1+num2;
			break;
		case '-':
			resultado=num1-num2;
			break;
		case '*':
			resultado=num1*num2;
			break;
		case '/':
			resultado=num1/num2;
			break;
		case '^':
			resultado=num1^num2;
			break;
		case '%':
			resultado=num1%num2;
			break;
		default :
			System.out.println("Syntax Error");
			break;
		}
		System.out.println("");
		System.out.print(num1+" "+operador+" "+num2+" = "+resultado);
		scan.close();
	}
	

}
