package guia1;
import java.util.Scanner;
import java.lang.Math;

public class Ejercicio_23_1 
{
	public static void CalculadoraPolacaInversaApp ()
	{
		Scanner scan = new Scanner(System.in);
		int num1, num2, resultado;
		double resultadoDouble;
		String signo;
		boolean salir = false;
		
		System.out.println("Ingrese el primer numero: ");
		int num1= scan.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		int num2= scan.nextInt();
		
		while(!salir)
	      {
	            
	           System.out.println("1. +: suma los dos operandos.");
	           System.out.println("2. -: resta los operandos");
	           System.out.println("3. *: multiplica los operandos");
	           System.out.println("4. /: divide los operandos");
	           System.out.println("5. ^: 1º operando como base y 2º como exponente");
	           System.out.println("6. %:  módulo, resto de la división entre operando1 y operando2");
	           System.out.println("7. Salir");
	            
	           System.out.print("Seleccione un signo aritmetico: ");
	           signo = scan.next();
	           
	           switch(signo)
	           {
	               case 1:
	            	   resultado= num1+num2;
	                   System.out.println("El resultado es: " + resultado);
	                   ;
	               case 2:
	            	   resultado= num1-num2;
	            	   System.out.println("El resultado es: " + resultado);
	                   ;
	                case 3:
	                	resultado= num1*num2;
	                	System.out.println("El resultado es: " + resultado);
	                   ;
	                case 4:
	                	resultadoDouble= num1/num2;
	                	System.out.println("El resultado es: " + resultado);
		               ;
	                case 5:
	                	resultado= Math.pow(num1, num2);
	                	System.out.println("El resultado es: " + resultado);
		               ;
		            case 6:
		            	resultado= num1%num2;
		            	System.out.println("El resultado es: " + resultado);
			          ;
	                case 7:
	                   salir=true;
	                   ;
	                default:
	                   System.out.println("Signo incorrecto.");
	           
	           }
	      }
	      scan.close();
	}
}
