package Clases;

public class EdificioDeOficinas implements Edificio
{
	private String nombreEdificio;
	private double superficieEdificio;
	private int numeroOficinas;
	
	public EdificioDeOficinas()
	{
		setSuperficieEdificio(0);
		setNumeroOficinas(0);
		setNombreEdificio(" ");
	}
	
	public EdificioDeOficinas(double superficieEdificio, int numeroOficinas, String nombreEdificio)
	{
		setNumeroOficinas(numeroOficinas);
		setSuperficieEdificio(superficieEdificio);
		setNombreEdificio(nombreEdificio);
	}
	
	public String getNombreEdificio() 
	{
		return nombreEdificio;
	}

	public void setNombreEdificio(String nombreEdificio) 
	{
		this.nombreEdificio = nombreEdificio;
	}
	
	public double getSuperficieEdificio()
	{
		return superficieEdificio;
	}
	public void setSuperficieEdificio(double superficieEdificio) 
	{
		this.superficieEdificio = superficieEdificio;
	}
	public int getNumeroOficinas() 
	{
		return numeroOficinas;
	}
	public void setNumeroOficinas(int numeroOficinas) 
	{
		this.numeroOficinas = numeroOficinas;
	}
	
	@Override
	public String toString()
	{
		return "El edificio de oficinas " + getNombreEdificio() + ", tiene " + getNumeroOficinas() + ", y una superfice de " + getSuperficieEdificio()+" m2";
	}
	
}
