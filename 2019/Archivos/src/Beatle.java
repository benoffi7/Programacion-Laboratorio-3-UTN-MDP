import java.io.Serializable;

public class Beatle implements Serializable
{
	/**
	 * 
	 */
	/**
	 * 
	 */	
	String nombre;

	public Beatle(String nombre) 
	{
		this.nombre = nombre;
	}
	

	
	public String mostrarPorPantalla()
	{
		return "Nombre: "+nombre;
	}
	
	
}
