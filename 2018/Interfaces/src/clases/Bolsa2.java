package clases;

import java.util.LinkedList;
import java.util.List;

import interfaces.IBolsa;

public class Bolsa2 implements IBolsa 
{
	private List<Object>lista;
	
	public Bolsa2() 
	{
		lista = new LinkedList<Object>();
	}
	
	@Override
	public void insertar(Object elemento) 
	{
		lista.add(elemento);

	}

}
