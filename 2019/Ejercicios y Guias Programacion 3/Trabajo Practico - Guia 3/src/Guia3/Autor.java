package Guia3;

public class Autor {
	
	private String nombre;
	private String apellido;
	private String genero;
	private String email;
	
	private void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	private void setApellido(String apellido)
	{
		this.apellido=apellido;
	}

	private void setGenero(String genero)
	{
		this.genero=genero;
	}
	private void setEmail(String email)
	{
		this.email=email;
	}
	private String getNombre()
	{
		return nombre;
	}
	private String getApellido()
	{
		return apellido;
	}

	private String getGenero()
	{
		return genero;
	}

	private String getEmail()
	{
		return email;
	}
	
	public String retornoNombre()
	{
		return getNombre();
	}
	public String retornoApellido()
	{
		return getApellido();
	}

	public String retornoGenero()
	{
		return getGenero();
	}
	
	public String retornoEmail()
	{
		return getEmail();
	}
	
	public Autor (String nombre, String apellido , String email, String genero)
	{
		setNombre(nombre);
		setApellido(apellido);
		setGenero(genero);
		setEmail(email);
	}
	
	public String toString()
	{
		return "Nombre:"+this.nombre+" || "+"Apellido:"+this.apellido+" || "+"Email:"+this.email+" || "+"Genero:"+this.genero;
		
	}
}
