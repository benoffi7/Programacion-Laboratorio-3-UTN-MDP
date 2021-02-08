package guia2;

public class Cuenta 
{
	private String nombre;     //atributos propios de la clase
	private String apellido;
	private int identificador;
	private float monto;
	
	
	//Constructores//
	public Cuenta ()
	{
		setNombre ("");
		setApellido ("");
		setIdentificador (0);
		setMonto (0);
	}
	
	
	public Cuenta (float montoInicial)
	{
		setNombre ("");
		setApellido ("");
		setIdentificador (0);
		setMonto(montoInicial);
	}
	
	
	//Nombre//
	public String getNombre ()   
	{
		return nombre;
	}
	
	public void setNombre (String nombreRecibido) 
	{
		nombre= nombreRecibido;
	}
	
	
	//Apellido//
	public String getApellido ()  
	{
		return apellido;
	}
	
	public void setApellido (String apellidoRecibido) 
	{
		apellido= apellidoRecibido;
	}
	

	//Identificador//
	private int getIdentificador ()
	{
		return identificador;
	}
	
	public void setIdentificador (int identificadorRecibido)
	{
		identificador= identificadorRecibido;
	}
	
	
	//Monto//
	public float getMonto ()
	{
		return monto;
	}
	
	private void setMonto (float montoRecibido)
	{
		monto= montoRecibido;
	}
	
	
	//Metodos//
	public void ingresar (float cantidadRecibida)
	{
		setMonto(getMonto()+cantidadRecibida);
	}
	
	public float getSaldo ()
	{
		return monto;
	}
	
	private boolean esMenor(float cant)
	{
		if (getMonto()<cant) return true;
		else return false;
}
	
	public void extraer (float cantidadIndicada)
	{
		if (esMenor(cantidadIndicada))
		{
			cantidadIndicada = getMonto();
		}
		setMonto(getMonto() - cantidadIndicada);
	}
}
