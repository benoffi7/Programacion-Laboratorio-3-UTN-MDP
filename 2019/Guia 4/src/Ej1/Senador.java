package Ej1;

public class Senador extends Legislador
{
	public Senador(String nombre, String apellido, int edad, String provincia)
	{
		super(nombre, apellido, edad, provincia);
	}
	
	public String camaraQueRepresenta()
	{
		return "\nPertenece a la Camara de Senadores.";
	}
	public String salarioLegislador()
	{
		return "\nSueldo: $100000.";
	}
	
}
