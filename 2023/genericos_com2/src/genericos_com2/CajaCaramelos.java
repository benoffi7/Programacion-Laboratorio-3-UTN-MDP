package genericos_com2;

import java.util.ArrayList;
import java.util.List;

public class CajaCaramelos
{
	
	private List<Caramelo> miLista;
	
	
	private int tope;

	
	public CajaCaramelos() {
		miLista = new ArrayList<>();
		tope = 10;
	}
	
	public boolean agregar(Caramelo a)
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
