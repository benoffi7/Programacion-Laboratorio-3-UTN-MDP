package EmpresaXYZ;

import java.util.ArrayList;

public class Gestor 
{
	private ArrayList<Empleado>listaEmpleados;
	
	public Gestor()
	{
		listaEmpleados = new ArrayList<>();
	}
	
	public void agregarEmpleado(Empleado empleado)
	{
		if(empleado != null)
		{
			listaEmpleados.add(empleado);
		}
	}
	
	public String sueldoMayor()
	{
		Empleado maxEmpleado = null;
		float sueldoMax = listaEmpleados.get(0).obtenerSalario();		
		
		for(Empleado empleado : listaEmpleados)
		{
			if(empleado.obtenerSalario() > sueldoMax)
			{
				maxEmpleado = empleado;
			}
		}
		
		return "\n\n\nEmpleado de mayor salario: "+ maxEmpleado.toString();
	}
	
	public String mostrarEmpleados()
	{
		StringBuilder builder = new StringBuilder();
		
		for(Empleado empleado : listaEmpleados)
		{
			builder.append(empleado.toString()+"\n");
		}
		
		return builder.toString();
	}
	
	
}
