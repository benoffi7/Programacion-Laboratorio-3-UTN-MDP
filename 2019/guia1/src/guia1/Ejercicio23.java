package guia1;

import java.util.Scanner;

public class Ejercicio23 {
	public static void CalculadoraPolacaInversaApp()
	{
		int num1=0,num2=0,res=0;
		String signo;
        Scanner leer= new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		num1=leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num1=leer.nextInt();
        System.out.println("Ingrese un signo aritmetico +,-,*,/,%,^");
        signo=leer.next();
        switch(signo)
        {
        case "+":
        {
        	res=num1+num2;
    		System.out.println("El resultado es "+res);
        	break;
        }
        case "-":
        {
        	res=num1-num2;
    		System.out.println("El resultado es "+res);
        	break;
        }
        case "/":
        {
        	res=num1/num2;
    		System.out.println("El resultado es "+res);
        	break;
        }
        case "*":
        {
        	res=num1*num2;
    		System.out.println("El resultado es "+res);

        	break;
        }
        case "^":
        {
        	res=num1^num2;
    		System.out.println("El resultado es "+res);
        	break;
        }

        }

	}
}
