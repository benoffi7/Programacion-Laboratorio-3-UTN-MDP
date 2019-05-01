package BLOCKBUSTER;

public class ElementoMultimedia {
	
	private String titulo;
	private String genero;
	private boolean entregado;
	private int codigo;
	private int cantidad;
	
	
	
	public ElementoMultimedia(String titulo, String genero, boolean entregado, int codigo,int cantidad) {
		this.titulo = titulo;
		this.genero = genero;
		this.entregado = false;
		this.codigo = codigo;
		this.cantidad=cantidad;
	}
	public ElementoMultimedia(String titulo,String genero,int codigo, int cantidad) {
		this.titulo = titulo;
		this.genero = genero;
		this.codigo = codigo;
		this.cantidad=cantidad;
	}
	public ElementoMultimedia(String titulo) {
		this.titulo=titulo;
	}
	
	
	
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void entregar() {
		entregado=true;
	}
	public void devolver(){
		entregado=false;
	}
	
	 public boolean isEntregado() {
		 return entregado;
	 }
	
	public double comparar(ElementoMultimedia a) {
		if(a instanceof Pelicula) {
			return ((Pelicula)a).getDuracion();
		}else if (a instanceof Videojuego) {
			return ((Videojuego)a).getHorasEstimadas();
		}
		return 0;
	}
	
	// falta metodo comparar por titulo
	
	@Override
	public String toString() {
		return " titulo=" + titulo + " genero=" + genero + " entregado=" + entregado + " codigo="
				+ codigo + " cantidad=" + cantidad;
	}
	
	
	
}
