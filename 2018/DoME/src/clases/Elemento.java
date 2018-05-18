package clases;

public abstract class Elemento{
	private String titulo;
	private int duracion;
	private boolean loTengo;
	private String comentario;

	/**
	 * Inicializa los campos del elemento.
	 * 
	 * @param elTitulo
	 *            el título de este elemento.
	 * @param tiempo
	 *            La duración de este elemento.
	 */
	public Elemento(String elTitulo, int tiempo) {
		titulo = elTitulo;
		duracion = tiempo;
		loTengo = false;
		comentario = "";
		
	}
	
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
	/*
	@Override
	public boolean equals(Object arg0) 
	{
		Elemento otroElemento = (Elemento)arg0;
		boolean igual = false;
		//return titulo.equals(otroElemento.getTitulo());
		if  ( ( titulo.equals(otroElemento.getTitulo()) ) && ( duracion == otroElemento.getDuracion() ) )
				{
					igual = true;
				}
		return igual;
	}
	*/
	
	/**
	 * 
	 */
	public  void imprimir()
	{
		System.out.println(titulo);
	}
		
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getDuracion() {
		return duracion;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "el titulo es "+titulo;
	}

}
