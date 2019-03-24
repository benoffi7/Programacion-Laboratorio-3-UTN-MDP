package Clases;

public class Ejercicio18 {

	public Ejercicio18() {
		
	}
	
	public double obtener_la_hipotenusa(double cateto1,double cateto2) {
		
		double hipotenusa=0;
		
		hipotenusa = (double) (Math.pow(cateto1,2) + Math.pow(cateto2, 2));
		
		hipotenusa= (double) Math.sqrt(hipotenusa);
	
		
		return hipotenusa;
	}
	
	
	
	
	
}
