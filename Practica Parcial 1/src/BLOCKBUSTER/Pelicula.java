package BLOCKBUSTER;

public class Pelicula extends ElementoMultimedia{

	private double duracion;
	private String creador;
	
	
	
	
	
	public Pelicula(String titulo, String genero, boolean entregado, int codigo, int cantidad, double duracion,
			String creador) {
		super(titulo, genero, entregado, codigo, cantidad);
		this.duracion = 60.0;
		this.creador = creador;
	}
	
	public Pelicula(String titulo, String genero, int codigo, int cantidad, double duracion,
			String creador) {
		super(titulo, genero, codigo, cantidad);
		this.duracion=60.0;
		this.creador=creador;
	}
	
	
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return " duracion=" + duracion + " creador=" + creador+super.toString();
	}
	
	
	
	
}
