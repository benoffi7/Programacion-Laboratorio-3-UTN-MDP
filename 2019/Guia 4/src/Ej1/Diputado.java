package Ej1;

public class Diputado extends Legislador
{
	public Diputado(String nombre, String apellido, int edad, String provincia)
	{
		super(nombre, apellido, edad, provincia);
	}
	
	public String camaraQueRepresenta()
	{
		return "\nPertenece a la Camara de Diputados.";
	}
	public String salarioLegislador()
	{
		return "\nSueldo: $120000.";
	}
	
}
