package app;

import java.util.ArrayList;

public class CatalogoV1 extends FuncionesCatalogo
{
	ArrayList<Elemento>elementos;
	
	public CatalogoV1() 
	{
		elementos = new ArrayList<>();
	}
	
	public int contarMusica()
	{
		int contadorMusica = 0;
		for (Elemento e : elementos)
		{
			if (e instanceof Musica) contadorMusica++;
		}
		return contadorMusica;
	}
	
	public ArrayList<Elemento> getElementos() {
		return elementos;
	}
	
	@Override
	public void agregar(Elemento e) 
	{
		elementos.add(e);

	}
	
	
	@Override
	public void listarElementos() {
		for (Elemento e : elementos)
		{
			System.out.println(e.imprimir());
		}
	}
	

	
	
	
}
