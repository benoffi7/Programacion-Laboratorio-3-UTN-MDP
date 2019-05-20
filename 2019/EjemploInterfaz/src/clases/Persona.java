package clases;

public class Persona implements ICantar{

	@Override
	public void cantar() 
	{
		System.out.println("Estoy cantando en la ducha");
		
	}

	@Override
	public int desafinar(int nivel) 
	{
		return nivel*50;
	}

	

}
