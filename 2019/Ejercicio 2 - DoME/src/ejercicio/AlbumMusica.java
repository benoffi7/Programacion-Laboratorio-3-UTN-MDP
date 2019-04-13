package ejercicio;

public class AlbumMusica extends ElementoMultimedia
{
	private String banda;
	private int numeroDeCanciones;
	
	public AlbumMusica(String titulo, int año, int duracion, String loTengo, String comentario, String banda, int numeroDeCanciones)
	{
		super(titulo, año, duracion, loTengo, comentario);
		setBanda(banda);
		setNumeroDeCanciones(numeroDeCanciones);
	}

	@Override //Es únicamente una indicación de intenciones al compilador. Si no pones Override, seguirá sobrecargando 
	//y seguirá usando ese y no el del padre. La anotación no afecta para nada al hecho de sobrecargar, es simplemente
	//pedirle al compilador que te avise si te equivocaste al sobrecargar y en realidad no estás sobrecargando nada.
	public String imprimir()
	{
		return "[Album de musica]" + super.imprimir() + " | Banda = " + getBanda() + " | Numero de canciones = " + getNumeroDeCanciones() + "]\n";
	}

	public void setBanda(String banda)
	{
		this.banda = banda;
	}
	
	public void setNumeroDeCanciones(int numeroDeCanciones)
	{
		this.numeroDeCanciones = numeroDeCanciones;
	}

	public String getBanda()
	{
		return banda;
	}

	public int getNumeroDeCanciones()
	{
		return numeroDeCanciones;
	}
}