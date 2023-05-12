package genericos_com2;

import java.util.ArrayList;
import java.util.List;

public class CajaPerro
{
	
	private List<Perro> miLista;
	
	
	private int tope;

	
	public CajaPerro() {
		miLista = new ArrayList<>();
		tope = 10;
	}
	
	public boolean agregar(Perro a)
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

}
