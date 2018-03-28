package clases;

import java.util.ArrayList;

public class BaseDeDatos {

	private ArrayList<CD> cds;
	private ArrayList<DVD> dvds;

	/**
	 * Construye una BaseDeDatos vacía.
	 */
	public BaseDeDatos() {
		cds = new ArrayList<CD>();
		dvds = new ArrayList<DVD>();
	}

	/**
	 * Agrega un CD a la base.
	 * 
	 * @param elCD
	 *            El CD que se agregará a la base de datos.
	 */
	public void agregarCD(CD elCD) {
		cds.add(elCD);
	}

	/**
	 * Agrega un DVD a la base.
	 * 
	 * @param elDVD
	 *            El DVD que se agregará a la base de datos.
	 */
	public void agregarDVD(DVD elDVD) {
		dvds.add(elDVD);
	}

	/**
	 * Imprime en la terminal de texto un listado de todos los CD y DVD que
	 * actualmente están almacenados en la base.
	 */
	public void listar() {
		// imprime la lista de CD
		for (CD cd : cds) {
			cd.imprimir();
			System.out.println(); // línea vacía entre los elementos
		}
		// imprime la lista de DVD
		for (DVD dvd : dvds) {
			dvd.imprimir();
			System.out.println(); // línea vacía entre los elementos
		}
	}
}
