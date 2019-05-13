import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICantar persona = new Persona();
		ICantar pajaro = new Pajaro();
		//ICantar otroCantar = new OtraClase();
		cantar(pajaro);
		cantar(persona);
		
		ArrayList<ICantar>list = new ArrayList<>();
		list.add(persona);
		list.add(pajaro);
		
		for (ICantar v : list)
		{
			v.cantar();
		}

	}
	
	
	public static void cantar(ICantar iCantar)
	{
		iCantar.cantar();
	}
	
	public static void cantar(Persona persona)
	{
		persona.cantar();
	}
	
	public static void cantar(Pajaro persona)
	{
		persona.cantar();
	}

}
