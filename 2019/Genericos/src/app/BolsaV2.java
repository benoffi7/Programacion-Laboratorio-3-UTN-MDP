package app;
import java.util.ArrayList;
import java.util.Iterator;

public class BolsaV2<T, Gonzalo>  implements Iterable<Gonzalo>{

	private ArrayList<Gonzalo> lista = new ArrayList<Gonzalo>();
	private int tope;
	Gonzalo atributo;
	Gonzalo variable;

	public BolsaV2(int tope, Gonzalo p)
	{
		this.tope = tope;
		Gonzalo p2;
		Gonzalo variableGonzalo;
		T soyUnaVariable;
	
	}
	
	
	public BolsaV2(Gonzalo parametro) {
		this.atributo = parametro;
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