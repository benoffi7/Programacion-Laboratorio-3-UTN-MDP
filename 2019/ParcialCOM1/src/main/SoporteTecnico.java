package main;

public class SoporteTecnico extends MiembroPlantel
{
	private String areaEspecializada;
	
	public SoporteTecnico() 
	{
		super();
		areaEspecializada = "";
	}

	public SoporteTecnico(String nombre, String apellido, String edad, String localidad
			,String areaEspecializada)
	{
		super(nombre, apellido, edad, localidad);
		this.areaEspecializada = areaEspecializada;
	}
	
	public SoporteTecnico (SoporteTecnico soporteTecnico)
	{
		super(soporteTecnico.getNombre(),soporteTecnico.getApellido(),soporteTecnico.getEdad(),soporteTecnico.getLocalidad());
		this.areaEspecializada = soporteTecnico.getAreaEspecializada();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ " "+getAreaEspecializada();
	}
	
	@Override
	public String estoyViajando() {
		// TODO Auto-generated method stub
		return "Viajo en colectivo por falta de presupuesto "+super.estoyViajando();
	}
	
	@Override
	public String estoyConcentrar() {
		// TODO Auto-generated method stub
		return "Me fijo que todo tenga pilas"+ super.estoyConcentrar();
	}
	
	public String arreglar()
	{
		return "Estoy reiniciando la maquina nomas";
	}
	
	public String getAreaEspecializada() {
		return areaEspecializada;
	}
	
	
}
