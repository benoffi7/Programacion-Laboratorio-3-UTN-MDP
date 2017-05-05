
public class Main {

	public static void main(String[] args) 
	{
		Persona persona = new Persona();
		Pajaro pajaro = new Pajaro();
		
		persona.cantar();
		pajaro.cantar();

		cantar(persona);
		
		cantar(pajaro);
	}
	
	static void cantar(Cantante cantor)
	{
		cantor.cantar();
	}

}
