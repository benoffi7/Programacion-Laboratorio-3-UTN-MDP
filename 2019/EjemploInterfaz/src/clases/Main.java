package clases;

import java.awt.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICantar pajaro = new Pajaro();
		ICantar persona = new Persona();
//		ICantar otraClase = new OtraClase();
		
		java.util.List<Persona> lista = new ArrayList<Persona>();
		
		cantar(persona);
		cantar(pajaro);
		
		ArrayList<ICantar>list = new ArrayList<>();
		list.add(persona);
		list.add(pajaro);
		
		for (ICantar obj : list)
		{
			System.out.println("Nivel: "+obj.desafinar(80));
		}

	}
	
	public static void cantar(ICantar iCantar)
	{
		iCantar.cantar();
	}

}
