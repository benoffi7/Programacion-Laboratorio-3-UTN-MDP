package Clases;
import java.util.Scanner;

public class Ejercicio1 {


//	Ejercicio nº1: Calcular el promedio de un arreglo de números enteros. 
	//	Realizar variantes con arreglos ya inicializados e ingreso por teclado.
		int num=0;
		Scanner scan= new Scanner(System.in);
		
		//constructor
		public Ejercicio1() {
			super();
		}		
		public void cargar_elementos(int [] a) {
			
			for(int i=0;i<5;i++){
				
				System.out.println("Agregue hasta 5 elementos: ");
				num= scan.nextInt();
				a[i]=num;
				scan.nextLine();
			}	
			
			
		}
		
		public double sacar_promedio_array(int [] a) {
			
			int suma=0;
			double promedio;
			for(int i=0;i<5;i++) {
				
				
				suma=suma+a[i];
							
			}
			promedio=(double) suma/a.length;
			
		
			return promedio;
		}

		public void mostrar_array(int [ ]a) {
			
			for(int i=0;i<5;i++) {
				System.out.println("Arreglo: " +a[i]);
			}
			
		}
		
		
		
	
	
}
