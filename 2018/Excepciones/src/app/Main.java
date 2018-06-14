package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)
	{
		
		/*
		escucha(false);
		
		
			try
			{
				int a;
				escucha(false);
				System.out.println("DEBAJO");
			}
			catch (RuntimeException error) 
			{
				System.out.println("Entro en el catch");
				System.out.println(error.getMessage());
				error.printStackTrace();
			}
			catch (Exception e) 
			{
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			finally 
			{
				System.out.println("FINaLLY");
			}
			
			System.out.println("FIN");
			
		
		
		try {
			System.out.println("Bloque try. Llamada a histog()");
			//histog();
			zatime();
		} catch (ArithmeticException a) {
			a.printStackTrace();
			System.out.println("Captura de excepción, " + a);
		} catch (RuntimeException r) {
			System.out.println("Captura de excepción, " + r);
		}
		
		
		
		
		
		
		try {
			entradaRango();
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		entradaRangoV2();
		
		
		
		try {
			entradaRango();
		} catch (NumberFormatException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try
		{
			miError();
		}
		catch (ArrayExcepcion e) 
		{
			//e.printStackTrace();
			System.out.println(e.informa());
		}
		catch (Exception e)
		{
			e.printStackTrace();
			e.getMessage();
		}
		
		escucha(false);
		*/
		prueba();

		}
	
	static void prueba() throws LongitudIncorrectaException 
	{
		String nombre = "sddddfsdsffdsdfsdfsdfsdsfssdfdsfsfsfdsadsadsaasddssdasdasdadfdfdsfdfsdffddfdfdf";
		if (nombre.length()>30)
		{
			throw new LongitudIncorrectaException("longitud incorrecta!");
		}
	}
	
	static void prueba2() 
	{
		String nombre = "sddddfsdsffdsdfsdfsdfsdsfdfdfdsfdfsdffddfdfdf";
		if (nombre.length()>30)
		{
			try {
				throw new LongitudIncorrectaException("longitud incorrecta!");
			} catch (LongitudIncorrectaException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	static void miError() throws ArrayExcepcion
	{
		int tam;
		tam = -10;
		if (tam <= 0)
			throw new ArrayExcepcion("pepe", tam);
	}

	/**
	    @param prestandoAtencion ¿Estamos prestando atencion? true|false
		@throws RuntimeException Si no estamos prestando atención
	 */
	static void escucha(boolean prestandoAtencion) {
		if (!prestandoAtencion)
			throw new RuntimeException("toma cafe");
	}

	
	static int histog() {
		int k, r, z;
		z = 0;
		k = 9;
		while (k > 1) {
			r = (int) (Math.random() * 13);
			System.out.print("r = " + r);
			z += r + (2 * r) / (r - k);
			System.out.println(" z = " + z);
			k--;
		}
		return z;
	}

	static int entradaRango() throws NumberFormatException, IOException  {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(null));
		int d;
		do {
			d = Integer.parseInt(entrada.readLine());
		} while (d <= 0 || d >= 10);
		return d;
	}

	static int entradaRangoV2() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(null));
		int d = 0;
		do {
			try {
				d = Integer.parseInt(entrada.readLine());
			} catch (NumberFormatException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
		} while (d <= 0 || d >= 10);
		return d;
	}

	static void atime() {
		int k, r;
		r = (int) Math.random();
		System.out.println("Método atime");
		k = 2 / r;
	}

	static void batime() {
		System.out.println("Método batime");
		atime();
	}

	static void zatime() {
		System.out.println("Método zatime");
		batime();
		
	}
	
	/**
	 * @see "Avengers: Infinite War" <a href=https://www.imdb.com/title/tt4154756> IMDB</a>
	 * @see Main#zatime()
	 * @param avenger el heroé que todos queremos
	 * @return verdadero porque Thanos es Thanos
	 */
	static <A> boolean didThanosKillYou (A avenger)
	{
		return true;
	}
}
