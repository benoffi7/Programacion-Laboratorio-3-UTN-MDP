package main;

public class Entrenador extends MiembroPlantel
{
	private int aniosExp;
	
	public Entrenador() {
		super();
		aniosExp = 0;
	}

	public Entrenador(String nombre, String apellido, String edad, String localidad,
			int aniosExp) {
		super(nombre, apellido, edad, localidad);
			this.aniosExp = aniosExp;
	}
	
	public Entrenador (Entrenador entrenador)
	{
		super(entrenador.getNombre(),entrenador.getApellido(),entrenador.getEdad(),entrenador.getLocalidad());
		setAniosExp(entrenador.getAniosExp());
		this.aniosExp = entrenador.getAniosExp();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ " "+getAniosExp();
	}
	
	public String darIndicaciones()
	{
		return "Pero mira para el costado pedazo de ciego!";
	}
	
	@Override
	public String estoyConcentrar() {
		// TODO Auto-generated method stub
		return "Estoy pensando una super estrategia, desconectar el teclado del resto"+super.estoyConcentrar();
	}
	
	@Override
	public String estoyViajando() {
		// TODO Auto-generated method stub
		return "Viajo en auto porque las estrellas son los players " +super.estoyViajando();
	}

	public int getAniosExp() {
		return aniosExp;
	}

	public void setAniosExp(int aniosExp) {
		this.aniosExp = aniosExp;
	}
	
	
}
