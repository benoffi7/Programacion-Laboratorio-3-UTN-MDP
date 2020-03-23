package EmpresaXYZ;

public class EmpleadoSalarioFijo extends Empleado
{
	private float salarioNeto;
	
	
	//Constructores
	public EmpleadoSalarioFijo() 
	{
		super();
		salarioNeto = obtenerSalario();
	}
	
	public EmpleadoSalarioFijo(String nombre, String apellido, String dni, int año, float salarioBase)
	{
		super(nombre, apellido, dni, año, salarioBase);
		salarioNeto = obtenerSalario();
	}
	
	//Getters
	private float getSalarioNeto() 
	{
		return salarioNeto;
	}
	
	
	//Metodos
	private float calcularSalarioExtra(float plus)
	{
		float salarioExtra = 0f;
		
		salarioExtra = getSalarioBase() + plus*getSalarioBase();
		
		return salarioExtra;
	}
	
	public float obtenerSalario()
	{
		float salarioFinal = getSalarioBase();
		int antiguedad = 2019 - getAño();
		
		if(antiguedad < 2)
		{
			salarioFinal = calcularSalarioExtra(0);
		}
		else
		{
			if(antiguedad == 2 || antiguedad == 3)
			{
				salarioFinal = calcularSalarioExtra((float)0.05);
			}
			else
			{
				if(antiguedad > 3 && antiguedad <= 7)
				{
					salarioFinal = calcularSalarioExtra((float)0.1);
				}
				else
				{
					if(antiguedad > 7 && antiguedad <= 15)
					{
						salarioFinal = calcularSalarioExtra((float)0.15);
					}
					else
					{
						if(antiguedad > 7 && antiguedad <= 15)
						{
							salarioFinal = calcularSalarioExtra((float)0.15);
						}
						else
						{
							salarioFinal = calcularSalarioExtra((float)0.2);
						}
					}
				}
			}
		}
		
		return salarioFinal;
	}
	
	public String toString()
	{
		return super.toString()+"\nSalario Neto por Empleado Asalariado: " + getSalarioNeto();
				
	}
	
}


