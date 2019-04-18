package ejercicio;

public class Musica extends ElementoMultimedia
{
	private String banda;
	private int numeroDeCanciones;
	
	public Musica(String titulo, int año, int duracion, char loTengo, String comentario, String banda, int numeroDeCanciones)
	{
		super(titulo, año, duracion, loTengo, comentario);
		this.banda = banda;
		this.numeroDeCanciones = numeroDeCanciones;
	}

	@Override
	public String imprimir()
	{
		return "[Musica]" + super.imprimir() + " | banda = " + banda + " | numero de canciones = " + numeroDeCanciones + "]\n";
	}

	public String getBanda()
	{
		return banda;
	}
	
	public void setBanda(String banda)
	{
		this.banda = banda;
	}
	
	public int getNumeroDeCanciones()
	{
		return numeroDeCanciones;
	}
	
	public void setNumeroDeCanciones(int numeroDeCanciones)
	{
		this.numeroDeCanciones = numeroDeCanciones;
	}
		
}