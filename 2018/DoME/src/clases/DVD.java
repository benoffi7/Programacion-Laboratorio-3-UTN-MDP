package clases;

public class DVD {
	private String titulo;
	private String director;
	private int duracion;
	private boolean loTengo;
	private String comentario;

	/**
	 * Constructor de objetos de la clase DVD
	 * 
	 * @param elTitulo
	 *            el título del DVD.
	 * @param elDirector
	 *            El director del DVD.
	 * @tiempo El tiempo de duración del DVD.
	 */
	public DVD(String elTitulo, String elDirector, int tiempo) {
		titulo = elTitulo;
		director = elDirector;
		duracion = tiempo;
		loTengo = false;
		comentario = "";
	}

	/**
	 * Asigna un comentario para este DVD.
	 * 
	 * @param comentario
	 *            El comentario que se ingresará.
	 */
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	/**
	 * @return El comentario de este DVD.
	 */
	public String getComentario() {
		return comentario;
	}

	/**
	 * Asigna el valor a la bandera que indica si tenemos este DVD.
	 * 
	 * @parametro mePertenece true si tenemos el DVD, false en caso contrario.
	 */
	public void setLoTengo(boolean mePertenece) {
		loTengo = mePertenece;
	}

	/**
	 * @return true si tenemos una copia de este DVD.
	 */
	public boolean getLoTengo() {
		return loTengo;
	}

	/**
	 * Imprime en la terminal de texto los detalles de este DVD.
	 */
	public void imprimir() {
		System.out.print("DVD: " + titulo + " (" + duracion + " minutos)");
		if (loTengo) {
			System.out.println("*");
		} else {
			System.out.println();
		}
		System.out.println(" " + director);
		System.out.println(" " + comentario);
	}
}