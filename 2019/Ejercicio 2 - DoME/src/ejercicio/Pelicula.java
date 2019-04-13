package ejercicio;

public class Pelicula extends ElementoMultimedia
{
	private String director;
	
	public Pelicula(String titulo, int año, int duracion, String loTengo, String comentario, String director)
	{
		super(titulo, año, duracion, loTengo, comentario);
		setDirector(director);
	}

	@Override //Es únicamente una indicación de intenciones al compilador. Si no pones Override, seguirá sobrecargando 
	//y seguirá usando ese y no el del padre. La anotación no afecta para nada al hecho de sobrecargar, es simplemente
	//pedirle al compilador que te avise si te equivocaste al sobrecargar y en realidad no estás sobrecargando nada.
	public String imprimir()
	{
		return "[Pelicula]" + super.imprimir() + " | Director = " + getDirector() + "]\n";
	}

	public String getDirector()
	{
		return director;
	}

	public void setDirector(String director)
	{
		this.director = director;
	}
}