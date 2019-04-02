package app;
import java.util.Scanner;

public class Ejercicio14TrabajarNum {
	
	static Scanner scan;
	
	public static void DuplicarTriplicar() {
	
		scan = new Scanner(System.in);
		System.out.print("\n\nIngrese un valor: ");
		int num = scan.nextInt();
		int doble = num*2, triple = num*3;
		
		System.out.print("Valor: "+num +", su doble: "+doble +", su triple :"+triple);		
	}
}