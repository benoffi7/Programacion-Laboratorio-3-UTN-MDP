package clases;

public class Pajaro implements ICantar
{

	@Override
	public void cantar() {
		System.out.println("Pio pio");
		
	}

	@Override
	public int desafinar(int nivel) 
	{
		// TODO Auto-generated method stub
		return nivel;
	}

}
