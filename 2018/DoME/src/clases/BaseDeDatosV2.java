package clases;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Esta clase almacenara los Elemento en un ArrayList. 
 * Además podremos listar, agregar y verificar la existencia.
 * @author Gonzalo
 * @since Primer cuatrimestre 2018
 * @version 1.0
 */
public class BaseDeDatosV2 {
	private ArrayList<Elemento> lista;

	/**
	 * Construye una BaseDeDatos vacía.
	 */
	public BaseDeDatosV2() {
		lista = new ArrayList<Elemento>();
	
	}

	/**
	 * Agrega un elemento en la base sin ninguna comprobación
	 * @param elElemento cualquier clase que herede de Elemento.
	 */
	public void agregarElemento(Elemento elElemento) {
		lista.add(elElemento);
	}

	
	/**
	 * Imprime una lista en la terminal de texto de todos los elementos
	 * almacenados actualmente.
	 * <br>{@code for Elemento}</br>
	 * Archivo: {@docRoot}
	 * @see {@link Elemento#imprimir()}
	 */
	public void listar() {
		for (Elemento elemento : lista) {
			elemento.imprimir();
			System.out.println(); // una línea vacía entre elementos
		}
	}
	
	/**
	 * 
	 * @param c El elemento a buscar para contar sus repeticiones.
	 * Debe tener el método equals implementado
	 * @return la cantidad de veces que ese Elemento se encuentra en la lista
	 */
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