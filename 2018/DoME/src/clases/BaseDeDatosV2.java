package clases;

import java.util.ArrayList;
import java.util.Collections;

public class BaseDeDatosV2 {
	private ArrayList<Elemento> lista;

	/**
	 * Construye una BaseDeDatos vacía.
	 */
	public BaseDeDatosV2() {
		lista = new ArrayList<Elemento>();
	
	}

	/**
	 * Agrega un elemento en la base.
	 */
	public void agregarElemento(Elemento elElemento) {
		lista.add(elElemento);
	}

	/**
	 * Imprime una lista en la terminal de texto de todos los elementos
	 * almacenados actualmente.
	 */
	public void listar() {
		for (Elemento elemento : lista) {
			elemento.imprimir();
			System.out.println(); // una línea vacía entre elementos
		}
	}
	
	public int frecuencia(Elemento c)
	{
		return Collections.frequency(lista, c);
	}
	
	public boolean existe(Elemento c)
	{
		//return lista.contains(c);
		
		for (Elemento e : lista)
		{
			if (c.equals(e))
			{
				return true;
			}
		}
		return false;
		
	}
}