package Clases;

public class Ejercicio6 {
	
	
	
	public Ejercicio6() {
		
		// TODO Auto-generated constructor stub
	}

	public static boolean esPrimo(int numero){
		  int contador = 2;
		  boolean primo=true;
		  while ((primo) && (contador!=numero)){
		    if (numero % contador == 0)
		      primo = false;
		    contador++;
		  }
		  return primo;
		}

}
