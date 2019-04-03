package Main;

public class Persona 
{
	private int edad;
	private String nombre;
	private String apellido;
	
	//public static final int MAYORIA_EDAD = 18;
	public static  int MAYORIA_EDAD = 18;
	
	//esto es un constructor
	//lleva el nombre de la clase TAL CUAL
	//0..N parametros
	//NO TIENE RETORNO
	public Persona()
	{
		setNombre("");
		setApellido("");
		setEdad(1);
	}
	
	public Persona(String nombre,String apellido,int edad)
	{
		setNombre(nombre);
		setApellido(apellido);
		setEdad(edad);
	}
	
	public Persona(String nombre)
	{
		setNombre(nombre);
		setApellido("");
		setEdad(1);
	}
	
	private String getNombre()
	{
		return nombre;
	}
	
	private String getApellido()
	{
		return apellido;
	}
	
	public int getEdad()
	{
		return edad;
	}
	
	public void setEdad(int edadRecibida)
	{
		edad = edadRecibida;
	}
	
	public void setNombre(String nombre)
	{
		//MI nombre = nombre parametro, vease colores
		this.nombre = nombre;
	}
	
	public void setApellido(String apellidRecibido)
	{
		apellido = apellidRecibido;
	}
	
	private boolean isMayor()
	{
		if (getEdad()>=MAYORIA_EDAD) return true;
		else return false;
	}
	
	public String isMayorFormateado()
	{
		if (isMayor()) return "si";
		else return "no";
		
	}
	
	public String getNyA()
	{
		return getNombre()+" "+getApellido();
	}
}
