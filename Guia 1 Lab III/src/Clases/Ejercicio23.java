package Clases;

public class Ejercicio23 {

	public Ejercicio23() {
		
	}
	
	public void calculadoraPolacaInversaAPP(int numero1,int numero2,String signoAritmetico) {
		
		double total;
		
		if(signoAritmetico.equalsIgnoreCase("+")) {
			
			total=numero1+numero2;
			System.out.println("La suma de " + numero1 + "y el " + numero2 + "es "+ total);
			
		}
		else if(signoAritmetico.equalsIgnoreCase("-")) {
			
			total=numero1-numero2;
			System.out.println("La resta de " + numero1 + "y el " + numero2 + "es "+ total);

		}
		else if(signoAritmetico.equalsIgnoreCase("*")) {
			
			total=numero1*numero2;
			System.out.println("La multiplicacion de " + numero1 + "y el " + numero2 + "es "+ total);
			
		}
		else if(signoAritmetico.equalsIgnoreCase("/")) {
			
			total=(double) numero1/ (double)numero2;
			System.out.println("La division de " + numero1 + "y el " + numero2 + "es "+ total);
		}
		else if(signoAritmetico.equalsIgnoreCase("^")){
			
			total=Math.pow(numero1, numero2);
			System.out.println("La potencia de " + numero1 + "sobre el " + numero2 + "es "+ total);		
		}
		else if(signoAritmetico.equalsIgnoreCase("%")){
			
			total=((double) numero1 % (double)numero2);
			
			System.out.println("El resto de la division entre " + numero1 + "y " + numero2 + "es "+ total);		
		}
		

		
		
	}
	
	
	
	
}
