package EmpresaXYZ;

public class Persona 
{
	private String nombre;
	private String apellido;
	private String dni;
	
	
	//Constructores
	public Persona()
	{
		super();
		setNombre("");
		setApellido("");
		setDni("");
	}
	
	public Persona(String nombre, String apellido, String dni)
	{
		super();
		setNombre(nombre);
		setApellido(apellido);
		setDni(dni);
	}
	
	
	//Setters
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	private void setDni(String dni) {
		this.dni = dni;
	}
	
	
	//Getters
	private String getNombre() {
		return nombre;
	}
	
	private String getApellido() {
		return apellido;
	}
	
	private String getDni() {
		return dni;
	}
	
	
	//Metodos
	
	@Override
	public String toString()
	{
		return ("\nNombre: " + getNombre() + " "+ getApellido() + ". DNI: "+ getDni());	
	}
	
}
