package ejercicio;

import java.util.ArrayList;

public class Catalogo
{
	private ArrayList<AlbumMusica> albumesMusica;
	private ArrayList<Pelicula> peliculas;
	
	public Catalogo()
	{
		albumesMusica = new ArrayList<>();
		peliculas = new ArrayList<>();
	}
	
	public void agregarElementoACatalogo(ElementoMultimedia a)
	{
		if (a instanceof AlbumMusica) 
			albumesMusica.add((AlbumMusica)a);
		else
			peliculas.add((Pelicula)a);
	}
	
	public ArrayList<AlbumMusica> retornarAlbumesMusica()
	{
		return albumesMusica;
	}
	
	public ArrayList<Pelicula> retornarPeliculas()
	{
		return peliculas;
	}
	
	public AlbumMusica buscarAlbumMusicaEnCatalogo(String tituloABuscar)
	{
		AlbumMusica miAlbumMusicaBuscado = null;
		for (AlbumMusica e : albumesMusica)
		{
			if (e.getTitulo().equals(tituloABuscar))
			{
				miAlbumMusicaBuscado = e;
				break;
			}
		}
		return miAlbumMusicaBuscado;
	}
	
	public Pelicula buscarPeliculaEnCatalogo(String tituloABuscar)
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
	
	public boolean modificarLoTengoOComentarioAlbumMusica(int idAModificar, int opcion, String modificacion)
	{
		boolean exito = false;
		for (AlbumMusica e : albumesMusica)
		{
			if (e.getIdElemento() == idAModificar)
			{
				if (opcion == 1)
				{
					e.setLoTengo(modificacion);
					exito = true;
				}
				else if (opcion == 2)
				{
					e.setComentario(modificacion);
					exito = true;
				}
				break;
			}
		}
		return exito;
	}
	
	public boolean modificarLoTengoOComentarioPelicula(int idAModificar, int opcion, String modificacion)
	{
		boolean exito = false;
		for (Pelicula e : peliculas)
		{
			if (e.getIdElemento() == idAModificar)
			{
				if (opcion == 1)
				{
					e.setLoTengo(modificacion);
					exito = true;
				}
				else if (opcion == 2)
				{
					e.setComentario(modificacion);
					exito = true;
				}
				break;
			}
		}
		return exito;
	}
	
	public boolean eliminarAlbumMusica(int idAEliminar)
	{
		boolean exito = false;
		for (AlbumMusica e : albumesMusica)
		{
			if (e.getIdElemento() == idAEliminar)
			{
				albumesMusica.remove(e);
				exito = true;
				break;
			}
		}
		return exito;	
	}
	
	public boolean eliminarPelicula(int idAEliminar)
	{
		boolean exito = false;
		for (Pelicula e : peliculas)
		{
			if (e.getIdElemento() == idAEliminar)
			{
				peliculas.remove(e);
				exito = true;
				break;
			}
		}
		return exito;	
	}
}