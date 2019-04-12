package guia1;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio23 {
	
	static Scanner scan;
	static String n1;
	static String n2;
	static int numero1;
	static int numero2;
	static String signoAritmetico;
	static float resultado;

	public static void CalculadoraPolacaInversaApp()
	{
		IngresoDeDatos();
		switch(signoAritmetico)
		{
		case "+":
			resultado =numero1 + numero2;
			JOptionPane.showMessageDialog( null, "Resultado: "+resultado);
			break;
		case "-":
			resultado = numero1 - numero2;
			System.out.print((int)resultado);
			break;
		case "*":
			resultado = numero1 * numero2;
			System.out.print((int)resultado);
			break;
		case "/":
			double div =(double)numero1 / numero2;
			System.out.print(div);
			break;
		case "^":
			resultado =(float) Math.pow(numero1,numero2);
			System.out.print(resultado);
			break;
		case "%":
			resultado = numero1 % numero2;
			System.out.print(resultado);
			break;
		default:
			System.out.print("opcion incorrecta");
			break;
		}
		
	}
	
	public static void IngresoDeDatos()
	{
		
		scan = new Scanner(System.in);
		
		n1 = JOptionPane.showInputDialog("ingrese un numero: ");
		numero1 = Integer.parseInt(n1);
		signoAritmetico = JOptionPane.showInputDialog("ingrese un signo: ");
		n2 = JOptionPane.showInputDialog("ingrese un numero: ");
		numero2 = Integer.parseInt(n2);
	}
}
