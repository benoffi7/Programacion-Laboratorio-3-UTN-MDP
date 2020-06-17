package ej5;

public interface IColeccionInterfaz<T> {
	/**
	 * 
	 * @return devuelve true si la colección está vacía y false en caso contrario.
	 */
	boolean estaVacia(); 
	/**
	 * 
	 * @return devuelve y elimina el primer elemento de la colección.
	 */
	T extraer();
	/**
	 * devuelve el primer elemento de la colección.
	 */
	T primero(); 
	/**
	 *  añade un objeto por el extremo que corresponda, 
	 *  y devuelve true si se ha añadido y false en caso contrario.
	 */
	boolean agregar(T elemento);

}
