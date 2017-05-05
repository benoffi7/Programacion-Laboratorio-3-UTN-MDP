
public interface ColeccionInterfaz 
{
	public boolean estaVacia();//devuelve true si la colección está vacía y false en caso contrario.
	public int extraer();// devuelve y elimina el primer elemento de la colección.
	public int primero();// devuelve el primer elemento de la colección.
	public boolean add(int elemento); //añade un objeto por el extremo que corresponda, y devuelve true si se ha añadido y false en caso contrario.*
}
