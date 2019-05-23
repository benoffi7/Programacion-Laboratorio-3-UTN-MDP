package app;

public class MetodoGenerico<T>{
	/*
	 * Se declara un m�todo gen�rico que convierte argumentos de cualquier tipo
	 * en una cadena. El m�todo que se define devuelve un String, el cual es un
	 * tipo concreto y sus argumentos son gen�ricos; para implementar el m�todo
	 * gen�rico aCadena() se llama a toString().
	 */
	public void metodo(T aaa )
	{
	}
	
	
	
	public static <T,V> String aCadena(T a, T b, V var) {
		String q;
		V otraVariable;
		
		q = a.toString();
		q = q + b.toString();
		
		return q;
	}
	
	public static <T,N,Gonzalo> String aCadena2(T a, T b)
	{
		Gonzalo pepe;
		String q;
		q = a.toString();
		q = q + b.toString();
		return q;
	}
	
	public static <T extends Chocolatina> void pruebaMetodo(T var)
	{
		var.getMarca();
	}
}
