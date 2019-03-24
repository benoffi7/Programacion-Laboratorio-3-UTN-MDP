package Clases;

public class Ejercicio16 {

	public Ejercicio16() {
		
	}
	  public void calcular_Longitud_Area(int radio)
	    {

	        double longitud;
	        double area;

	        longitud=2*Math.PI*radio;

	        area=Math.PI*Math.pow(radio, 2);

	        System.out.println("La longitud de la circunferencia es: " +longitud);
	        System.out.println("El area de la circunferencia es: " +area);

	    }
	
}
