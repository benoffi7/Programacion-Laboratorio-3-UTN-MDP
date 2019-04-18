package ejercicio;

public class ElementoMultimedia extends Catalogo
{
	private String titulo;
	private int año;
	private int duracion; //En minutos
	private char loTengo;
	private String comentario;
	
	public ElementoMultimedia(String titulo, int año, int duracion, char loTengo, String comentario)
	{
		this.titulo = titulo;
		this.año = año;
		this.duracion = duracion;
		this.loTengo = loTengo;
		this.comentario = comentario;
	}
	
	public String imprimir()
	{
		return "[Titulo = " + titulo + " | año = " + año + ", duracion = " + duracion + " min. | ¿Lo tengo? = " + loTengo + " | comentario = " + comentario + "]";
	}

	public String getTitulo()
	{
		return titulo;
	}
	
	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}
	
	public int getAño() 
	{
		return año;
	}
	
	public void setAño(int año)
	{
		this.año = año;
	}
	
	public int getDuracion()
	{
		return duracion;
	}
	
	public void setDuracion(int duracion)
	{
		this.duracion = duracion;
	}
	
	public char getLoTengo()
	{
		return loTengo;
	}
	
	public void setLoTengo(char loTengo)
	{
		this.loTengo = loTengo;
	}
	
	public String getComentario()
	{
		return comentario;
	}
	
	public void setComentario(String comentario)
	{
		this.comentario = comentario;
	}
}
