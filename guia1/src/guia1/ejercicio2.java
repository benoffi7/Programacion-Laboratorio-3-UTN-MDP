package guia1;

import java.util.Scanner;

public class ejercicio2 {

	static Scanner scan;

	public static boolean paroImpar() {
		boolean flag = false;
		int numero = 0;
		scan = new Scanner(System.in);
		System.out.println("ingrese un numero: ");
		numero = scan.nextInt();

		if (numero % 2 == 0) {
			flag = true;
		}

		return flag;
	}

	public static void resolucionEjer2() {
		boolean flag = paroImpar();
		if (flag == true)
		{
         System.out.println("numero par");  
		}else {
		 System.out.println("numero impar");	
		}
	}
}
