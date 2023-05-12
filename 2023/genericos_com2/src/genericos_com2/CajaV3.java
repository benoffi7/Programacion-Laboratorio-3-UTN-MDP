package genericos_com2;

import java.util.ArrayList;

public class CajaV3<T>//cualquier cosa que no existe en ningun lado
{
	//definir una variable
	private T unaVariable;
	//definiar una coleccion
	private ArrayList<T>unaLista;
	
	private int tope;
	
	public CajaV3() {
		unaLista = new ArrayList<>();
		//unaVariable = new T(); no puedo
	}
	
	//un retorno
	public T getUnaVarible() {
		return unaVariable;
	}
	
	//un parametro
	public void agregar(T unElemento)
	{
		unaLista.add(unElemento);
	}
}
