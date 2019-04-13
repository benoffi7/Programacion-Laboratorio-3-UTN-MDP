package e2;

public class Cliente
{
	private int id;
	private String nombre;
	private char genero;
	
	public Cliente (int id, String nombre, char genero)
	{
		setId(id);
		setNombre(nombre);
		setGenero(genero);
	}
	
	public void setId(int id)
	{
		this.id = id;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public void setGenero(char genero)
	{
		this.genero = genero;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public char getGenero()
	{
		return genero;
	}
	
	public String retornarDatosCliente()
	{
		String datos = "ID: " + getId() + " | Nombre: " + getNombre() + " | Genero: " + getGenero();
		return datos;
	}
}
