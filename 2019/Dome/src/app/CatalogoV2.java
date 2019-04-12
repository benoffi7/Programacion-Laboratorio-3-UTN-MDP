package app;

import java.util.ArrayList;

public class CatalogoV2 extends FuncionesCatalogo
{
	ArrayList<Musica> arrayListMusica;
	ArrayList<Pelicula>arrayListPelicula;
	
	public CatalogoV2() {
		arrayListMusica = new ArrayList<>();
		arrayListPelicula = new ArrayList<>();
	}
	
	
	public int contarMusica()
	{
		return arrayListMusica.size();
	}
	
	@Override
	public void agregar(Elemento e) {
		if (e instanceof Musica) arrayListMusica.add((Musica)e);
		else if (e instanceof Pelicula) arrayListPelicula.add((Pelicula)e);
	}
	
	
	@Override
	public void listarElementos()
	{
		for (Musica e : arrayListMusica)
		{
			System.out.println(e.imprimir());
		}
		for (Pelicula e : arrayListPelicula)
		{
			System.out.println(e.imprimir());
		}
	}
	
	

}
