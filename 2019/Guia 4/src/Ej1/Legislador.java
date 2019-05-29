package Ej1;

public abstract class Legislador extends Persona
{
	private String provinciaQueRepresenta;
	
	
	//Constructores
	public Legislador()
	{
		super();
		setProvinciaQueRepresenta("");
	}
	
	public Legislador(String nombre, String apellido, int edad, String provincia)
	{
		super(nombre, apellido, edad);
		setProvinciaQueRepresenta(provincia);
	}

	
	//Setters
	private void setProvinciaQueRepresenta(String provinciaQueRepresenta)
	{
		this.provinciaQueRepresenta = provinciaQueRepresenta;
	}
	
	//Getters
	public String getProvinciaQueRepresenta()
	{
		return provinciaQueRepresenta;
	}


	//Metodos
	public String toString()
	{
		return super.toString() + "\nProvincia: " + getProvinciaQueRepresenta();
	}
	
	abstract public String camaraQueRepresenta();
	abstract public String salarioLegislador();	
}
