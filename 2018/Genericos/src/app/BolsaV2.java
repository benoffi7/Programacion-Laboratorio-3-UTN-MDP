package app;
import java.util.ArrayList;
import java.util.Iterator;

public class BolsaV2<Gonzalo  extends Cloneable>  implements Iterable<Gonzalo>{

	private ArrayList<Gonzalo> lista = new ArrayList<Gonzalo>();
	private int tope;

	public BolsaV2(int tope)
	{
		this.tope = tope;
	}

	public void add(Gonzalo objeto)
	{
		if (lista.size() <= tope) 
		{
			lista.add(objeto);
		}
		
	}

	public Iterator<Gonzalo> iterator() {
		return lista.iterator();
	}

	

}