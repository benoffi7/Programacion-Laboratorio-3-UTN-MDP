package clases;

public class DVD  extends Elemento
{
	private String director;

	/**
	 * Constructor de objetos de la clase DVD
	 * 
	 * @param elTitulo
	 *            el título del DVD.
	 * @param elDirector
	 *            El director del DVD.
	 * @tiempo El tiempo de duración del DVD.
	 */
	public DVD(String elTitulo, String elDirector, int tiempo) 
	{
		super(elTitulo, tiempo);
		director = elDirector;
	}
	
	public String getDirector() 
	{
		return director;
	}

	@Override
	public void imprimir() 
	{
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	


	

}