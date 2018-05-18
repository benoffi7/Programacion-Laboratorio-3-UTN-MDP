package clases;
/**
 * 
 * @author Gonzalo
 * @since 1.0
 * @version 1.0
 * @param 
 *
 */
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
		//super.imprimir();
		System.out.println(getTitulo());
		
	}
	/**
	 * @return String la representacion de caracteres del objeto. 
	 * incluye el director y el llamado al toString del padre
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" El director es "+director);
	
		return builder.toString();
	}
	

	
	
	
	


	

}