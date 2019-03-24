package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int dim=4;
		int[] numeros = {1, 4, 6, 7, 2};
		int[] arreglo = new int[dim];
		float promedio=0;
		int validos = cargarArreglo(arreglo,dim);
		mostrarArreglo(arreglo,validos);
		//promedio = calcularPromedio (numeros,5);
		promedio = calcularPromedio (arreglo,validos);
		System.out.println("El promedio es" + " "+ promedio);

	}
	
	public static int cargarArreglo (int[] arreglo, int dim) {
		
		int i=0;
		String control = "Si";
		
	    Scanner scan = new Scanner (System.in);
		while (control.equalsIgnoreCase("Si") && i<dim) {
			System.out.println("Ingrese un numero");
			int num = scan.nextInt();
			arreglo[i] = num;
			System.out.println("Desea continuar? Ingrese Si");
			control=scan.next();
			i++;
		}
		
		scan.close();
		
		return i;
	}
	
	public static void mostrarArreglo(int[] arreglo, int validos) {
		
		int i;
		
		for (i=0 ; i<validos ; i++) {
			System.out.println(arreglo[i]);
		}
	}
	
	public static float calcularPromedio(int[] numeros, int validos) {
		
		int i, suma=0;
		float promedio=0;
		
		for (i=0 ; i<validos ; i++) {
			suma += numeros[i];
		}
		
		promedio = (float)suma/validos;
		
		return promedio;
		
	}

}
