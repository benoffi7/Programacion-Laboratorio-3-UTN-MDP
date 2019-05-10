package main;

import java.util.ArrayList;

public class Plantel 
{
	private ArrayList<MiembroPlantel>miembrosDelPlantel;
	
	private final int cantidadMaximaEntrenadores = 1;
	
	public Plantel() {
		miembrosDelPlantel = new ArrayList<>();
	}
	
	/**
	 * 
	 * @param miembroPlantel cualquier clase que herede MiembroPlantel
	 * @return true si se agrego
	 */
	public boolean agregarMiembroPlantel(MiembroPlantel miembroPlantel)
	{
		boolean rta = false;
		if (miembroPlantel != null)
		{
			if (miembroPlantel instanceof Jugador)
			{
				rta = verificarJugador((Jugador)miembroPlantel);
				if (rta)
				{
					miembrosDelPlantel.add(miembroPlantel);
				}
			}else if (miembroPlantel instanceof Entrenador)
			{
				rta = verificarEntrenador();
				if (rta)
				{
					miembrosDelPlantel.add(miembroPlantel);
				}
			}
			else
			{
				miembrosDelPlantel.add(miembroPlantel);
				rta = true;
			}
		}
		return rta;
	}
	
	public int contarVictoriasJugadores()
	{
		int contador = 0;
		for (MiembroPlantel miembroPlantel : miembrosDelPlantel)
		{
			if (miembroPlantel instanceof Jugador)
			{
				contador = contador + ((Jugador)miembroPlantel).getCantidadVictorias();
			}
		}
		return contador;
	}
	
	public String listarTodosLosMiembros()
	{
		StringBuilder builder = new StringBuilder();
		for (MiembroPlantel miembroPlantel : miembrosDelPlantel)
		{
			builder.append(miembroPlantel.toString()+"\n");
		}
		return builder.toString();
	}
	
	public String listarUnTipoEnParticular(int tipo)
	{
		StringBuilder builder = new StringBuilder();
		for (MiembroPlantel miembroPlantel : miembrosDelPlantel)
		{
			if ((tipo == 1) && (miembroPlantel instanceof Jugador))
								builder.append(miembroPlantel.toString()+"\n");
			if ((tipo == 2) && (miembroPlantel instanceof Entrenador))
				builder.append(miembroPlantel.toString()+"\n");
			if ((tipo == 3) && (miembroPlantel instanceof SoporteTecnico))
				builder.append(miembroPlantel.toString()+"\n");
		}
		return builder.toString();
	}
	
	public String listarMiembros(Jugador j)
	{
		StringBuilder builder = new StringBuilder();
		for (MiembroPlantel miembroPlantel : miembrosDelPlantel)
		{
			if (miembroPlantel instanceof Jugador)
								builder.append(miembroPlantel.toString()+"\n");
			
		}
		return builder.toString();
	}
	
	public String listarMiembros(Entrenador j)
	{
		return "";
	}
	
	public String listarMiembros(SoporteTecnico j)
	{
		return "";
	}
	
	public String listarJugadores()
	{
		StringBuilder builder = new StringBuilder();
		for (MiembroPlantel miembroPlantel : miembrosDelPlantel)
		{
			if (miembroPlantel instanceof Jugador)
								builder.append(miembroPlantel.toString()+"\n");
			
		}
		return builder.toString();
	}
	
	/**
	 * 
	 * @param jugador a agregar
	 * @return true si puedo agregar
	 */
	public boolean verificarJugador(Jugador jugador)
	{
		boolean rta = true;
		for (MiembroPlantel miembroPlantel : miembrosDelPlantel)
		{
			if (miembroPlantel instanceof Jugador)
			{
				//Jugador jugadorTemporal = (Jugador)miembroPlantel;
				if (miembroPlantel.equals(jugador))
				{
					rta = false;
				}
			}
		}
		return rta;
	}
	
	public boolean verificarEntrenador()
	{
		boolean rta = true;
		int contador = 0;
		for (MiembroPlantel miembroPlantel : miembrosDelPlantel)
		{
			if (miembroPlantel instanceof Entrenador)
			{
				contador++;
			}
		}
		if (contador>cantidadMaximaEntrenadores) rta = false;
		return rta;
	}
	
	/*
	 * 	NO TIENEN QUE ESTAR!!!!
	 * 
	public ArrayList<MiembroPlantel> getMiembrosDelPlantel() {
		return miembrosDelPlantel;
	}
	
	public void setMiembrosDelPlantel(ArrayList<MiembroPlantel> miembrosDelPlantel) {
		this.miembrosDelPlantel = miembrosDelPlantel;
	}
	*/
	
	
}
