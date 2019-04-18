package ejercicio;

import java.util.ArrayList;

public class Catalogo
{
	ArrayList<Musica> musicas;
	ArrayList<Pelicula> peliculas;
	
	public Catalogo()
	{
		musicas = new ArrayList<>();
		peliculas = new ArrayList<>();
	}
	
	public void agregarElemento(ElementoMultimedia a)
	{
		if (a instanceof Musica) 
			musicas.add((Musica)a);
		else
			peliculas.add((Pelicula)a);
	}
	
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
	
	public Musica buscarYRetornarAlbumMusica(String tituloABuscar)
	{
		Musica miAlbumMusicaBuscado = null;
		for (Musica e : musicas)
		{
			if (e.getTitulo().equals(tituloABuscar))
			{
				miAlbumMusicaBuscado = e;
				break;
			}
		}
		return miAlbumMusicaBuscado;
	}
	
	public boolean modificarAlbumMusica(String tituloABuscar,Musica miAlbumDeMusica)
	{
		boolean exito=false;
		for (Musica e : musicas)
		{
			if (e.getTitulo().equals(tituloABuscar))
			{
				e.setTitulo(miAlbumDeMusica.getTitulo());
				e.setAño(miAlbumDeMusica.getAño());
				e.setDuracion(miAlbumDeMusica.getDuracion());
				e.setLoTengo(miAlbumDeMusica.getLoTengo());
				e.setComentario(miAlbumDeMusica.getComentario());
				e.setBanda(miAlbumDeMusica.getBanda());
				e.setNumeroDeCanciones(miAlbumDeMusica.getNumeroDeCanciones());
				exito=true;
				break;
			}
		}
		return exito;
	}
	
	public boolean eliminarAlbumDeMusica(String tituloABuscar)
	{
		boolean exito=false;
		for(Musica e : musicas)
		{
			if (e.getTitulo().equals(tituloABuscar))
			{
				musicas.remove(e);
				exito=true;
				break;
			}
		}
		return exito;
	}
	
	public ArrayList<Musica> retornarAlbumesMusica()
	{
		return musicas;
	}
	
	//Pelicula
	public Pelicula buscarYRetornarPelicula(String tituloABuscar)
	{
		Pelicula miPeliculaBuscada = null;
		for (Pelicula e : peliculas)
		{
			if (e.getTitulo().equals(tituloABuscar))
			{
				miPeliculaBuscada = e;
				break;
			}
		}
		return miPeliculaBuscada;
	}
	
	public boolean modificarPelicula(String tituloABuscar,Pelicula miPelicula)
	{
		boolean exito=false;
		for (Pelicula e : peliculas)
		{
			if (e.getTitulo().equals(tituloABuscar))
			{
				e.setTitulo(miPelicula.getTitulo());
				e.setAño(miPelicula.getAño());
				e.setDuracion(miPelicula.getDuracion());
				e.setLoTengo(miPelicula.getLoTengo());
				e.setComentario(miPelicula.getComentario());
				e.setDirector(miPelicula.getDirector());
				exito=true;
				break;
			}
		}
		return exito;
	}
	
	public boolean eliminarPelicula(String tituloABuscar)
	{
		boolean exito=false;
		for(Pelicula e : peliculas)
		{
			if (e.getTitulo().equals(tituloABuscar))
			{
				peliculas.remove(e);
				exito=true;
				break;
			}
		}
		return exito;
	}
	
	public ArrayList<Pelicula> retornarPeliculas()
	{
		return peliculas;
	}
	
}
