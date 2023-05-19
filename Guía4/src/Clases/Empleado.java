package Clases;

public abstract class Empleado extends Persona
{
	private int a�oIngreso;
	private float sueldoMesCorriente;
	private float salarioBase;

	protected Empleado()
	{
		super();
		setA�oIngreso(0);
		setSueldoMesCorriente(0);
		setSalarioBase(0);
	}
	
	protected Empleado(String dni, String nombre, String apellido, int a�oIngreso, float salarioBase)
	{
		super(dni,nombre,apellido);
		setA�oIngreso(a�oIngreso);
		setSalarioBase(salarioBase);
		setSueldoMesCorriente(0);
	}
	
	protected int getA�oIngreso() 
	{
		return a�oIngreso;
	}

	protected void setA�oIngreso(int a�oIngreso) 
	{
		this.a�oIngreso = a�oIngreso;
	}

	protected float getSueldoMesCorriente() 
	{
		return sueldoMesCorriente;
	}

	protected void setSueldoMesCorriente(float sueldoMesCorriente)
	{
		this.sueldoMesCorriente = sueldoMesCorriente;
	}

	protected float getSalarioBase() {
		return salarioBase;
	}

	protected void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	protected abstract float obtenerSalario();
	
	@Override
	public String toString() {
		return "Empleado "+ super.toString() + ", a�oIngreso=" + a�oIngreso + ", sueldoMesCorriente=" + sueldoMesCorriente;
	}

	
	
}
