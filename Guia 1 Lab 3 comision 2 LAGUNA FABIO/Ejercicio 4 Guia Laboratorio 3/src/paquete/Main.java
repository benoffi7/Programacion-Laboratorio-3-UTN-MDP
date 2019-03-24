package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Ingresar la cantidad de numeros primos que desea ver");
		Scanner scan = new Scanner(System.in);
		int cant = scan.nextInt();
		scan.close();
		
		calcularPrimos (cant);

	}
	
	public static void calcularPrimos (int validos) {
		
		int i=0, j=2, k, res;
		
		while (i<validos) {
			res=1;
			k=2;
			while ((k<j)&&(res!=0)) {
				res=j%k;
				k++;
			}
			if (res==1) {
				mostrarNumero (j);
				i++;
			}
			j++;
		}
	}
	
	public static void mostrarNumero (int numero) {
		
		System.out.println(numero);
	}

}
