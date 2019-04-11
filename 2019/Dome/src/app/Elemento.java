package app;

public class Elemento
{
	private String nombre;
	private float duracion;
	private String genero;
	private String autor;
	private String comentarios;
	private boolean favorito;
	private boolean loTengo;
	private int cantidadReproducciones;
	
	public Elemento(String nombre, float duracion, String genero, String autor, String comentarios, boolean favorito,
			boolean loTengo, int cantidadReproducciones) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
		this.genero = genero;
		this.autor = autor;
		this.comentarios = comentarios;
		this.favorito = favorito;
		this.loTengo = loTengo;
		this.cantidadReproducciones = cantidadReproducciones;
	}
	
	

	public String imprimir() {
		return "Elemento [nombre=" + nombre + ", duracion=" + duracion + ", genero=" + genero + ", autor=" + autor
				+ ", comentarios=" + comentarios + ", favorito=" + favorito + ", loTengo=" + loTengo
				+ ", cantidadReproducciones=" + cantidadReproducciones + "]";
	}



	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}



	public void setFavorito(boolean favorito) {
		this.favorito = favorito;
	}



	public void setLoTengo(boolean loTengo) {
		this.loTengo = loTengo;
	}

	public void aumentarCantidadReproducciones() {
		this.cantidadReproducciones = cantidadReproducciones+1;
	}


	



	public String getNombre() {
		return nombre;
	}

	public float getDuracion() {
		return duracion;
	}

	public String getGenero() {
		return genero;
	}

	public String getAutor() {
		return autor;
	}

	public String getComentarios() {
		return comentarios;
	}

	public boolean isFavorito() {
		return favorito;
	}

	public boolean isLoTengo() {
		return loTengo;
	}

	public int getCantidadReproducciones() {
		return cantidadReproducciones;
	}
	
	
	
	
	
	
}
