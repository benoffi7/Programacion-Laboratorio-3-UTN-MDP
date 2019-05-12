package Clases;

public class Persona 
{
	private String dni;
	private String nombre;
	private String apellido;
	
	protected Persona()
	{
		setDni(" ");
		setNombre(" ");
		setApellido(" ");
	}
	
	protected Persona(String dni, String nombre, String apellido)
	{
		setDni(dni);
		setNombre(nombre);
		setApellido(apellido);
	}
	
	protected String getDni() 
	{
		return dni;
	}

	protected void setDni(String dni)
	{
		this.dni = dni;
	}

	protected String getNombre() 
	{
		return nombre;
	}

	protected void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	protected String getApellido() 
	{
		return apellido;
	}

	protected void setApellido(String apellido)
	{
		this.apellido = apellido;
	}

	@Override
	public String toString() 
	{
		return  "[ nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni ;
	}

	
}
