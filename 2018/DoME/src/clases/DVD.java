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
	
	public DVD() {
		super("",0);
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
	
	@Override
	public boolean equals(Object obj) 
	{
		if (obj instanceof DVD)
		{
			DVD arg0 = (DVD)obj;
			return director.equals(arg0.getDirector());
		}
		else
		{
			return false;
		}
	}
	
	
	
	


	

}