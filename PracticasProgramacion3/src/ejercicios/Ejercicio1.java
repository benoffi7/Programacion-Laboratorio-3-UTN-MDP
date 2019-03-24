package ejercicios;

public class Ejercicio1 {
	public static void arregloPromedio (int arreglo[]) {
		float promedio;
		int suma=0;
		int i;
		for ( i = 0; i < arreglo.length; i++) {
			suma+= arreglo[i];
		}	
		promedio = suma / i;
		System.out.println("El promedio del arreglo es " + promedio);
	}
}
