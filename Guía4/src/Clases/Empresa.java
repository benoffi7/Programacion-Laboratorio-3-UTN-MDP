package Clases;

import java.util.ArrayList;

public class Empresa 
{
	private String nombreEmpresa;
	private ArrayList<Empleado> empleados;
	
	public Empresa()
	{
		setNombreEmpresa(" ");
		empleados = new ArrayList<>();
	}
	
	public Empresa(String nombreEmpresa)
	{
		setNombreEmpresa(nombreEmpresa);
		empleados = new ArrayList<>();
	}
	
	public Empresa(String nombreEmpresa, ArrayList<Empleado> empleados)
	{
		setNombreEmpresa(nombreEmpresa);
		setEmpleados(empleados);
	}
	
	public String getNombreEmpresa()
	{
		return this.nombreEmpresa;
	}
	
	public void setNombreEmpresa(String nombreEmpresa)
	{
		this.nombreEmpresa = nombreEmpresa;
	}
	
	private void setEmpleados(ArrayList<Empleado> empleados)
	{
		this.empleados = empleados;
	}
	
	public void agregarEmpleado(Empleado empleado)
	{
		empleados.add(empleado);
	}
	
	public String listarEmpleados()
	{
		String listaEmpleados = "Empleados: ";
		if(!empleados.isEmpty())
		{
			for(Empleado aux : empleados)
			{
				if(aux instanceof Fijo)
				{
					Fijo aux1 = (Fijo) aux;
					listaEmpleados = listaEmpleados +  "\n" + aux1.toString();
				}
				if(aux instanceof Acomision)
				{
					Acomision aux2 = (Acomision) aux;
					listaEmpleados = listaEmpleados +  "\n" + aux2.toString();
				}
			}
		}
		return listaEmpleados;
	}
	
	public String listarEmpleadosFijos()
	{
		String listaEmpleados = "Empleados Fijos: ";
		if(!empleados.isEmpty())
		{
			for(Empleado aux : empleados)
			{
				if(aux instanceof Fijo)
				{
					Fijo aux1 = (Fijo) aux;
					listaEmpleados = listaEmpleados +  "\n" + aux1.toString();
				}
			}
		}
		return listaEmpleados;
	}
	
	public String listarEmpleadosAcomision()
	{
		String listaEmpleados = "Empleados a comision: ";
		if(!empleados.isEmpty())
		{			
			for(Empleado aux : empleados)
			{
				if(aux instanceof Acomision)
				{
					Acomision aux2 = (Acomision) aux;
					listaEmpleados = listaEmpleados +  "\n" + aux2.toString();
				}
			}
		}
		return listaEmpleados;
	}
	
	
	public String EmpleadoConSueldoMayor()
	{
		String empleado = " ";
		if(!empleados.isEmpty())
		{
			Empleado recorre = empleados.get(0);
			empleado= recorre.toString();
			
			for(Empleado aux : empleados)
			{
				if(recorre.getSueldoMesCorriente() < aux.getSueldoMesCorriente())
				{	
					recorre=aux;
					empleado = recorre.toString();
				}
			}
		}
		return empleado;
	}
	
	public void actualizarSueldos()
	{
		if(!empleados.isEmpty())
		{
			for(Empleado recorre : empleados)
			{
				if(recorre instanceof Fijo) 
				{
					Fijo aux = (Fijo) recorre;
					aux.setSueldoMesCorriente(aux.obtenerSalario()); 
				}
				if(recorre instanceof Acomision) 
				{
					Acomision aux = (Acomision) recorre;
					aux.setSueldoMesCorriente(aux.obtenerSalario()); 
				}
			}
		}
		
	}
	
	@Override
	public String toString()
	{
		return "Empresa " + getNombreEmpresa();
	}
	
}
