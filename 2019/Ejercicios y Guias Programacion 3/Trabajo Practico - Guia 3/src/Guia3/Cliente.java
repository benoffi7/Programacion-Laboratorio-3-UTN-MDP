package Guia3;

public class Cliente {
	private float id;
	private String nombreYApellido;
	private String genero;
	
	private void setId(float id)
	{
		this.id=id;
	}
	private void setNombreYApellido(String nombreYApellido)
	{
		this.nombreYApellido=nombreYApellido;
	}

	private void setGenero(String genero)
	{
		this.genero=genero;
	}
	
	private float getId()
	{
		return id;
	}
	private String getNombreYApellido()
	{
		return nombreYApellido;
	}

	private String getGenero()
	{
		return genero;
	}
	
	public float retornoId()
	{
		return getId();
	}
	public String retornoNombreYApellido()
	{
		return getNombreYApellido();
	}

	public String retornoGenero()
	{
		return getGenero();
	}
	//CONSTRUCTOR
	public Cliente (float id, String nombreYApellido ,String genero)
	{
		setId(id);
		setNombreYApellido(nombreYApellido);
		setGenero(genero);
		
	}
}
