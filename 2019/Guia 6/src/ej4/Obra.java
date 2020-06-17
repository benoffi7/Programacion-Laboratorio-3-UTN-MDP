package ej4;

public abstract class Obra {
	private int codigo;
	private String titulo;
	private int anioPublicacion;

	public Obra(int codigo, String titulo, int anioPublicacion) {
		super();
		setCodigo(codigo);
		setTitulo(titulo);
		setAnioPublicacion(anioPublicacion);
	}

	public int getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	private void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	private void setAnioPublicacion(int anioPublicación) {
		this.anioPublicacion = anioPublicación;
	}


	
	@Override
	public String toString() {
		return "Codigo= " + getCodigo() + "\nTitulo=" + getTitulo() 
		+ "\nAño de Publicacion: " + getAnioPublicacion();
	}

}
