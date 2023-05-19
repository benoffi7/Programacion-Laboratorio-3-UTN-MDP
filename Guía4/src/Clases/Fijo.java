package Clases;

public class Fijo extends Empleado
{
	private float porcentajeExtra; 
	
	public Fijo()
	{
		super();
		setPorcentajeExtra(0);
	}
	
	public Fijo(String dni, String nombre, String apellido, int a�oIngreso, float salarioBase)
	{
		super(dni, nombre, apellido, a�oIngreso, salarioBase);
		setPorcentajeExtra(calcularPorcentajeExtra(a�oIngreso));
	}
	
	protected float getPorcentajeExtra() 
	{
		return porcentajeExtra;
	}
	
	protected void setPorcentajeExtra(float porcentajeExtra) 
	{
		this.porcentajeExtra = porcentajeExtra;
	}
	
	protected int calcularPorcentajeExtra (int a�oIngreso)
	{
		int rta = 20;
		int a�oActual = 2019;
		if (a�oActual - a�oIngreso < 16 )
		{
			rta = 15;
			if(a�oActual - a�oIngreso < 8)
			{
				rta = 10;
				if(a�oActual - a�oIngreso < 4)
				{
					rta = 5;
					if(a�oActual - a�oIngreso < 2)
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
