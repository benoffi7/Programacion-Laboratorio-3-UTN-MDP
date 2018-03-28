package clases;

import java.util.ArrayList;

public class BaseDeDatosV2 {
	private ArrayList<Elemento> elementos;

	/**
	 * Construye una BaseDeDatos vacía.
	 */
	public BaseDeDatosV2() {
		elementos = new ArrayList<Elemento>();
	}

	/**
	 * Agrega un elemento en la base.
	 */
	public void agregarElemento(Elemento elElemento) {
		elementos.add(elElemento);
	}

	/**
	 * Imprime una lista en la terminal de texto de todos los elementos
	 * almacenados actualmente.
	 */
	public void listar() {
		for (Elemento elemento : elementos) {
			elemento.imprimir();
			System.out.println(); // una línea vacía entre elementos
		}
	}
}