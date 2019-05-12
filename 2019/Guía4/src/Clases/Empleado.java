package Clases;

public abstract class Empleado extends Persona
{
	private int añoIngreso;
	private float sueldoMesCorriente;
	private float salarioBase;

	protected Empleado()
	{
		super();
		setAñoIngreso(0);
		setSueldoMesCorriente(0);
		setSalarioBase(0);
	}
	
	protected Empleado(String dni, String nombre, String apellido, int añoIngreso, float salarioBase)
	{
		super(dni,nombre,apellido);
		setAñoIngreso(añoIngreso);
		setSalarioBase(salarioBase);
		setSueldoMesCorriente(0);
	}
	
	protected int getAñoIngreso() 
	{
		return añoIngreso;
	}

	protected void setAñoIngreso(int añoIngreso) 
	{
		this.añoIngreso = añoIngreso;
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
		return "Empleado "+ super.toString() + ", añoIngreso=" + añoIngreso + ", sueldoMesCorriente=" + sueldoMesCorriente;
	}

	
	
}
