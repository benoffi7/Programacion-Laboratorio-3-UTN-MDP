package Main;

public class Persona 
{
	private String nombre;
	private String apellido;
	private int edad;
	
	private static int MAYOREDAD = 18;
	
	public Persona()
	{
		nombre = "";
		apellido = "";
		edad = 0;
	}
	
	public Persona(String nombreR,String apellido, int edadR)
	{
		nombre = nombreR;
		this.apellido = apellido;
		edad = edadR;
	}
	
	private boolean isMayor()
	{
		if (getEdad() >= MAYOREDAD)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	/**
	 * 
	 * @param param1 un numero positivo
	 * @param param2 otro numero positivo
	 * @return param1 si este es mayor que el otro sino al reves
	 */
	public int ejemploMetodo(int param1, int param2)
	{
		if (param1 > param2) return param1;
		else return param2;
	}
	/*
	 * nada
	 */
	public static int getMayorEdad()
	{
		return MAYOREDAD;
	}
	
	public static void setMayorEdad(int nuevoLimite)
	{
		 MAYOREDAD = nuevoLimite;
	}
	
	public String isMayorFormateado()
	{
		if (isMayor())return "si"; else return "no";
	}
	
	public String getNyA()
	{
		return getNombre()+" "+getApellido();
	}
	
	private String getApellido()
	{
		return apellido;
	}
	
	private String getNombre()
	{
		return nombre;
	}
	
	public int getEdad()
	{
		return edad;
	}
	
	public void setEdad(int edadR)
	{
		edad = edadR;
	}
	
	public void setNombre(String nombreR)
	{
		nombre = nombreR;
	}
	
	public void setApellido(String apellidoR)
	{
		apellido = apellidoR;
	}
	
	
}
