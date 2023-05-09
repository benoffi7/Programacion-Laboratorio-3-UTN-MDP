package genericos_com2;

import java.util.ArrayList;
import java.util.List;

public class CajaV2
{
	private List<Caramelo> miLista;
	private List<Perro> miLista2;
	private List<String> miLista3;
	
	private int tope;
	private int tope2;
	private int tope3;
	
	public CajaV2() {
		miLista = new ArrayList<>();
		//los otros new
		tope = 10;
		//los otros topes
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
	
	public boolean agregar(Perro a)
	{
		boolean seAgrego = false;
		if (miLista2.size()<tope2)
		{
			miLista2.add(a);
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
		return miLista2.size();
	}
	
	

}
