package ejercicios;

public class Ejercicio18 {
	public static void calcularTemperatura (float temperaturas[]) {
		float min, max, prom=0;
		min=max=temperaturas[0];
		for (int i = 0; i < temperaturas.length; i++) {
			prom+=temperaturas[i];
			if(min>temperaturas[i])
			{
				min=temperaturas[i];
			}
			if(max<temperaturas[i])
			{
				max=temperaturas[i];
			}
		}
		prom= (float)prom/temperaturas.length;		
		System.out.println("El promedio de temperaturas es: "+String.format("%.2f", prom)+"\nLa temperatura minima fue: "+String.format("%.2f", min)+"\nLa temperatura maxima fue: "+String.format("%.2f", max));
	}
}
