package app;

public class Ejercicio7SumaNaturales {
	
	public static void SumaNatural()
	{
		int num, suma = 0, limite = 10;
		
		for(num =1 ; num <= limite; num++)
		{
			suma += num; 
		}		
		
		System.out.println("\nLa suma de los primero 10 naturales es : "+suma);
	}
}