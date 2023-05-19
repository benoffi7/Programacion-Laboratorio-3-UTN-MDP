package Clases;

public class Fijo extends Empleado
{
	private float porcentajeExtra; 
	
	public Fijo()
	{
		super();
		setPorcentajeExtra(0);
	}
	
	public Fijo(String dni, String nombre, String apellido, int añoIngreso, float salarioBase)
	{
		super(dni, nombre, apellido, añoIngreso, salarioBase);
		setPorcentajeExtra(calcularPorcentajeExtra(añoIngreso));
	}
	
	protected float getPorcentajeExtra() 
	{
		return porcentajeExtra;
	}
	
	protected void setPorcentajeExtra(float porcentajeExtra) 
	{
		this.porcentajeExtra = porcentajeExtra;
	}
	
	protected int calcularPorcentajeExtra (int añoIngreso)
	{
		int rta = 20;
		int añoActual = 2019;
		if (añoActual - añoIngreso < 16 )
		{
			rta = 15;
			if(añoActual - añoIngreso < 8)
			{
				rta = 10;
				if(añoActual - añoIngreso < 4)
				{
					rta = 5;
					if(añoActual - añoIngreso < 2)
					{
						rta = 0;
					}
				}
				
			}
		}
		return rta;
	}
	
	protected float obtenerSalario()
	{
		return getSalarioBase() + ((getSalarioBase() / 100) * this.porcentajeExtra);
	}
	
	@Override
	
	public String toString()
	{
		return super.toString() + "]";
	}
	
}
