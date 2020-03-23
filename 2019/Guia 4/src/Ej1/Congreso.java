package Ej1;

import java.util.ArrayList;

public class Congreso 
{
	private ArrayList<Legislador> listaLegisladores;
	public Congreso()
	{
		listaLegisladores = new ArrayList <>();
	}
	
	public void agregarLegislador(Legislador legislador)
	{
		if(legislador != null)
		{
			listaLegisladores.add(legislador);
		}
	}
	
	public String mostrarLegisladores()
	{
		StringBuilder builder = new StringBuilder();
		
		for(Legislador legislador : listaLegisladores)
		{
			builder.append(legislador.toString()+legislador.camaraQueRepresenta()+legislador.salarioLegislador()+"\n");
		}
		
		return builder.toString();
	}
	
}
