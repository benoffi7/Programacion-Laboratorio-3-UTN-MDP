package app;
import java.util.ArrayList;
import java.util.Iterator;

public class BolsaV1 implements Iterable{
	 
	private ArrayList lista= new ArrayList();
	private int tope;
	 
	public BolsaV1(int tope) 
	{
		this.tope = tope;
	}
	public void add(Object objeto )
	{
		if (lista.size()<=tope)
		{
			lista.add(objeto);
		}
	}
	
	@Override
	public Iterator iterator() 
	{
		return lista.iterator();
	}
	 
	}