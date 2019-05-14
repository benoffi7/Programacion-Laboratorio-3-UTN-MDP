package Clases;

public class Polideportivo implements InstalacionDeportiva,Edificio
{
	private String nombrePolideportivo;
	private int tipoDeInstalacion;
	private double superficieEdificio;

	public Polideportivo()
	{
		setNombrePolideportivo(" ");
		setTipoDeInstalacion(0);
		setSuperficieEdificio(0);
	}
	
	public Polideportivo(int tipoDeInstalacion, String nombrePolideportivo, double superficieDelEdificio)
	{
		setNombrePolideportivo(nombrePolideportivo);
		setTipoDeInstalacion(tipoDeInstalacion);
		setSuperficieEdificio(superficieDelEdificio);
	}
	

	public double getSuperficieEdificio() 
	{
		return superficieEdificio;
	}

	public void setSuperficieEdificio(double superficieDelEdificio)
	{
		this.superficieEdificio = superficieDelEdificio;
	}
	
	public String getNombrePolideportivo()
	{
		return nombrePolideportivo;
	}


	public void setNombrePolideportivo(String nombrePolideportivo)
	{
		this.nombrePolideportivo = nombrePolideportivo;
	}


	private void setTipoDeInstalacion(int tipoDeInstalacion) 
	{
		this.tipoDeInstalacion = tipoDeInstalacion;
	}

	public int getTipoDeInstalacion()
	{
		return this.tipoDeInstalacion;
	}
	
	@Override
	public String toString()
	{
		return "El polideportivo " + getNombrePolideportivo()+" es una instalacion de tipo "+ getTipoDeInstalacion()+ ", y tiene una superficie de "+ getSuperficieEdificio()+ " m2.";
	}
}
