package genericos_com2;

import java.util.ArrayList;
import java.util.List;

public class Caja 
{
	private List<Object> miLista;
	private int tope;
	
	public Caja() {
		miLista = new ArrayList<>();
		tope = 10;
	}
	
	public boolean agregar(Object a)
	{
		boolean seAgrego = false;
		if (miLista.size()<tope)
		{
			miLista.add(a);
			seAgrego = true;
		}
		return seAgrego;
			
	}
	
	public int getCantidad()
	{
		return miLista.size();
	}
	
	public int cantidadDePerros()
	{
		int cantidad = 0;
		for (Object o : miLista)
		{
			if (o instanceof Perro)
			{
				cantidad++;
			}
		}
		return cantidad;
	}
	
	

}
