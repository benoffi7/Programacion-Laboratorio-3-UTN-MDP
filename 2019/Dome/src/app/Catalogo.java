package app;

import java.util.ArrayList;

public class Catalogo 
{
	ArrayList<Elemento>elementos;
	
	//ArrayList<Musica>musicas;
	//ArrayList<Pelicula>peliculas;
	
	public Catalogo() 
	{
		elementos = new ArrayList<>();
		//peliculas = new ArrayList<>();
		//musicas = new ArrayList<>();
	}
	
	/*
	public void agregarElemento(Elemento a)
	{
		if (a instanceof Musica) 
						musicas.add((Musica)a);
		else peliculas.add((Pelicula)a);
	}
	*/
	
	public void agregarElemento(Elemento a)
	{
		elementos.add(a);
	}
	
	
	public void listarCatalogo()
	{
		for (Elemento e : elementos)
		{
			System.out.println(e.imprimir());
		}
	}
	

	public int contarPeliculas()
	{
		int contador = 0;
		for (Elemento e : elementos)
		{
			if (e instanceof Pelicula) contador++;
		}
		return contador;
	}
	
	public float contarDuracionMusica()
	{
		float contador = 0;
		for (Elemento e : elementos)
		{
			if (e instanceof Musica) contador = contador + e.getDuracion();
		}
		return contador;
	}
	
	
	/*
	public void listarCatalogo()
	{
		for (Musica e : musicas)
		{
			System.out.println(e.imprimir());
		}
		for (Pelicula e : peliculas)
		{
			System.out.println(e.imprimir());
		}
	}
	*/
	
}
