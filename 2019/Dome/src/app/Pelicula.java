package app;

public class Pelicula extends Elemento{

	private String director;

	public Pelicula(String titulo, double duracion, String autor, boolean favorito, String comentario,
			String director) {
		super(titulo, duracion, autor, favorito, comentario);
		this.director = director;
	}

}
