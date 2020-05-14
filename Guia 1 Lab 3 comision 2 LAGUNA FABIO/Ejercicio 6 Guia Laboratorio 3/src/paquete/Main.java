package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		iniciar();		
	}
	
	public static void iniciar () {
		
		String resp = "Si";
		Scanner scan = new Scanner(System.in);
		while (resp.equalsIgnoreCase("Si")) {
			System.out.println("Ingrese un numero para comprobar si es primo o no");
			int numero = scan.nextInt();
			int flag = comprobarPrimo(numero);
			if (flag==1) {
				System.out.println("El numero " + numero + " es primo");
			}else {
				System.out.println("El numero " + numero + " no es primo");
			}
			
			System.out.println("Para ingresar otro numero escriba 'Si'");
			resp = scan.next();
		}
		scan.close();
	}
	
	public static int comprobarPrimo (int numero) {
		
		int i=2, res=1;
		
		while ((i<numero)&&(res!=0)) {
			res=numero%i;
			i++;
		}
		
		return res;
	}

}
