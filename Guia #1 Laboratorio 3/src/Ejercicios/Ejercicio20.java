package Ejercicios;

public class Ejercicio20 {
	
	public static void generarNumRandom(int num1, int num2) {
		int numRan=0, rango=0;
		rango= (num2 - num1) + 1;
		System.out.println("Números aleatorios generados entre " + num1 + " y " + num2 + " : ");
		for(int i=0;i<10;i++) {
			numRan=(int) (Math.random() * rango) + num1;
			System.out.println(numRan);
		}
	}

}
