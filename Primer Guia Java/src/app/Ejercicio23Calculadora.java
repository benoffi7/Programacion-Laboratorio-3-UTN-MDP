package app;
import java.util.Scanner;

public class Ejercicio23Calculadora{

	static Scanner scan= new Scanner(System.in);
	static float numero1, numero2, resultado;
	
	public static float Sumar() {
		
		return numero1 + numero2;			
	}
	
	public static float Restar(){
		
		return numero1 - numero2;
	}
	
	public static float Multiplicar() {
		
		return numero1 * numero2;
	}
	
	public static float Dividir() {
 
		return numero1 / numero2;	
	}
	
	public static float Potencia() {
		
		return (float)Math.pow(numero1, numero2);	
	}
	
	public static float Modulo() {
 
		return numero1 % numero2;		
	}
	
	public static void MenuCalcu() {
		
		System.out.print("\nValor: ");
		numero1= scan.nextInt();
		
		System.out.print("\nOperacion: ");
		char operacion = scan.next().charAt(0);
		
		System.out.print("\nValor: ");
		numero2= scan.nextInt();
		
		switch(operacion)
		{
		
		case '+': resultado = Sumar();
				System.out.println("Resultado: "+resultado);
				break; 
				
		case '-': resultado = Restar();
		  System.out.println("Resultado: "+resultado);
		break;
						
		case '*': resultado = Multiplicar();
		  System.out.println("Resultado: "+resultado);
				break;
			
		case '/': resultado = Dividir();
		  System.out.println("Resultado: "+resultado);
				break;

		case '^': resultado = Potencia();
		  System.out.println("Resultado: "+resultado);
			break;
	
		case '%': resultado = Modulo();
				  System.out.println("Resultado: "+resultado);
			break;
	
		default: System.out.println("Error, reintente");
				break;
		}
	}
}
