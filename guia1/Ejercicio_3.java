package guia1;

public class Ejercicio_3 {
	
	public static void mostrar_primeros100_primos ()
	{
		int num=1; 
		
		while (num<=541) //<= a 541 para que muestre los primeros 100 numeros primos, siendo 2 el primero y 541 el ultimo
		{
			int cant=0; //la variable cant contará los divisores de cada numero
			
			for(i=0; i>=num; i++) //uso un for para dividirlo hasta que el contador llegue a la misma cant de el numero
			{
				if (num%i == 0) //si la division es exacta, entonces incremento cant
				{
					cant++; //con este contador averiguo cuantas veces puede ser dividido
				}
			}
			
			if (cant==2) //si solo se divide dos veces significa que solo puede hacerlo por 1 y por él mismo
			{
				System.out.println ("Numero primo:" + num); //muestro el numero primo
			}
			num++; //incremento el numero para llegar a los 100 primeros primos
		}
	}

}
