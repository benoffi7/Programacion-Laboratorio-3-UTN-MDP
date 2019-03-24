package Clases;

import java.util.Random;

public class Ejercicio20 {

	public Ejercicio20() {
		
		
	}
	
	public void generar_numeros_random_entre_dosNumeros(int numero1,int numero2) {
		
		
		
		Random aleatorio = new Random();
		for(int i=0;i<10;i++) {
		
			System.out.println(numero1+aleatorio.nextInt( (numero2) - numero1));
		}
		
		
	}
	
	
	
	

}
