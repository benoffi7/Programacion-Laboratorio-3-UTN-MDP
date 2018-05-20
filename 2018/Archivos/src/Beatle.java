import java.io.Serializable;

public class Beatle implements Serializable
{
	String nombre;

	public Beatle(String nombre) 
	{
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
	
	
}
