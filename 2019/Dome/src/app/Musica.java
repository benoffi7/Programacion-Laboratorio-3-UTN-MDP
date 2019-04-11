package app;

public class Musica extends Elemento
{
	private int cantidadTemas;
	
	public Musica(String nombre, float duracion, String genero, String autor, String comentarios, boolean favorito,
			boolean loTengo, int cantidadReproducciones,int cantidadTemasR) 
	{
		super(nombre, duracion, genero, autor, comentarios, favorito, loTengo, cantidadReproducciones);
		cantidadTemas = cantidadTemasR;
	}
	
	public int getCantidadTemas() {
		return cantidadTemas;
	}

	@Override
	public String imprimir() {
		return "Musica [cantidadTemas=" + cantidadTemas + "] "+super.imprimir();
	}
	
	
	
	
	
	


}
