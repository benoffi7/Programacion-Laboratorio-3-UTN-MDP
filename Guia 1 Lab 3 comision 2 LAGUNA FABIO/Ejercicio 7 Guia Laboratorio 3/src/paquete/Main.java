package paquete;

public class Main {

	public static void main(String[] args) {
		
		int resultado = sumarNumeros ();
		System.out.println("La suma de los primeros diez numeros naturales es igual a " + resultado);
	}
	
	public static int sumarNumeros () {
		
		int i, suma=0;
		
		for (i=1 ; i<11 ; i++) {
			suma += i;
		}
		
		return suma;
	}

}
