package clases;

public class CD  extends Elemento implements Comparable<CD>
{
	private String interprete;
	private int numeroDeTemas;


	/**
	 * Inicializa el CD.
	 * 
	 * @param elTitulo
	 *            El título del CD.
	 * @param elInterprete
	 *            El intérprete del CD.
	 * @param temas
	 *            El número de temas del CD.
	 * @param tiempo
	 *            El tiempo que dura el CD.
	 */
	public CD(String elTitulo, String elInterprete, int temas, int tiempo)
	{
		super(elTitulo, tiempo);
		interprete = elInterprete;
		numeroDeTemas = temas;
	}
	
	/*
	 * invocacion directa al abuelo, porque metodo no esta en mi clase ni en la super
	 */
	

	
	public CD() 
	{
		super("", 0);
	}

	public String getInterprete() {
		return interprete;
	}
	
	public int getNumeroDeTemas() {
		return numeroDeTemas;
	}
	
	@Override
	public void imprimir() {
		System.out.println("interprete: "+interprete);

		
	}
	
	
	@Override
	public boolean equals(Object obj) 
	{
		boolean igual = super.equals(obj);
		if (obj instanceof CD)
		{
			CD arg0 = (CD)obj;
			igual = interprete.equals(arg0.getInterprete());	
		}
		else
		{
			igual = false;
		}
		return igual;
		
	}

	@Override
	public int compareTo(CD arg0) 
	{
		if (numeroDeTemas > arg0.numeroDeTemas) return 1;
		if (numeroDeTemas < arg0.numeroDeTemas) return -1;
		return 0;
	}

	

	
}