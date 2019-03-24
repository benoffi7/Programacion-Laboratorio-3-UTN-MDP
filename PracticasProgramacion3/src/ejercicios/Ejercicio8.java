package ejercicios;

public class Ejercicio8 {
	public static void añoBisiesto (int año) {
		if ((año % 4) ==0){
			System.out.println("El año: " + año + " es viciesto");
		}else{
			System.out.println("El año: " + año + " no es viciesto");
		}
	}
}
