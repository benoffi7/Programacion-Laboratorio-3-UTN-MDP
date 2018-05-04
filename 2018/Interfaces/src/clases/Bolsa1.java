package clases;

import java.util.ArrayList;
import java.util.List;

import interfaces.IBolsa;

public class Bolsa1 implements IBolsa 
{
	private List<Object>lista;
	
	public Bolsa1() 
	{
		lista = new ArrayList<>();
	}
	
	@Override
	public void insertar(Object elemento) 
	{
		lista.add(elemento);

	}

}
