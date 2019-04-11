package app;

public class Pelicula extends Elemento 
{
	private String director;
	
	public Pelicula(String nombre, float duracion, String genero, String autor, String comentarios, boolean favorito,
			boolean loTengo, int cantidadReproducciones,String directorR) {
		super(nombre, duracion, genero, autor, comentarios, favorito, loTengo, cantidadReproducciones);
		director = directorR;
	}

	@Override
	public String imprimir() {
		return "Pelicula [director=" + director + "] "+super.imprimir();
	}
	
	

}
