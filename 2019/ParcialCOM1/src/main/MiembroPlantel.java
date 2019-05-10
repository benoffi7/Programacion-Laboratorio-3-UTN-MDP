package main;

public class MiembroPlantel 
{
	private String nombre;
	private String apellido;
	private String edad;
	private String localidad;
	
	public MiembroPlantel() 
	{
		super();
		nombre = "";
		apellido = "";
		edad = "";
		localidad = "";
	}

	public MiembroPlantel(String nombre, String apellido, String edad, String localidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.localidad = localidad;
	}
	
	public MiembroPlantel(MiembroPlantel miembroPlantel)
	{
		super();
		setNombre(miembroPlantel.getNombre());
		setApellido(miembroPlantel.getApellido());
		setEdad(miembroPlantel.getEdad());
		setLocalidad(miembroPlantel.getLocalidad());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getNombre() + " " + getApellido();
	}
	
	public String estoyViajando()
	{
		return "Estoy viajando";
	}
	
	public String estoyConcentrar()
	{
		return "Estoy viajando";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	
	
	
	
}
