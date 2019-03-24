package guia1;
import java.util.Scanner;


public class Ejercicio_13 
{
	public static void saludar ()
	{
		Scanner scan= new Scanner (System.in);
		String nombre_introducido;
		System.out.println("Ingrese su nombre:");
		String nombre_introducido = scan.next();  
		scan.close();
		System.out.println("Buenos dias" + nombre_introducido);
	}
}
