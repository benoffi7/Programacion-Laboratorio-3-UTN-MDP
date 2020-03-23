package EmpresaXYZ;

public abstract class Empleado extends Persona
{
	private int año;
	private float salarioBase;
	
	
	//Constructores
	public Empleado()
	{
		super();
		setAño(0);
		setSalarioBase(0);
	}

	public Empleado(String nombre, String apellido, String dni, int año, float salarioBase)
	{
		super(nombre, apellido, dni);
		setAño(año);
		setSalarioBase(salarioBase);
	}
	
	//Setters
	private void setAño(int año) 
	{			
		this.año = año;
	}


	public void setSalarioBase(float salarioBase) 
	{
		this.salarioBase = salarioBase;
	}
	
	
	//Getters
	public int getAño() 
	{
		return año;
	}

	public float getSalarioBase() 
	{
		return salarioBase;
	}
	
	
	//Metodos
	
	@Override
	public String toString()
	{
		return super.toString() +"\nAño de ingreso: "+ getAño() + "\nSalario Base: " + getSalarioBase();
	}
	
	abstract public float obtenerSalario();
}
