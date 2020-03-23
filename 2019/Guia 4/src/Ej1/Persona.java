package Ej1;

public class Persona 
{
	private String nombre;
	private String apellido;
	private int edad;
	
	
	//Constructores
	public Persona()
	{
		super();
		setNombre("");
		setApellido("");
		setEdad(0);
	}
	
	public Persona(String nombre, String apellido, int edad)
	{
		super();
		setNombre(nombre);
		setApellido(apellido);
		setEdad(edad);
	}
	
	
	//Setters
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	private void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	//Getters
	private String getNombre() {
		return nombre;
	}
	
	private String getApellido() {
		return apellido;
	}
	
	private int getEdad() {
		return edad;
	}
	
	
	//Metodos
	public String toString()
	{
		return ("\nNombre: " + getNombre() + " "+ getApellido() + ". Edad: "+ getEdad());	
	}
	
}
