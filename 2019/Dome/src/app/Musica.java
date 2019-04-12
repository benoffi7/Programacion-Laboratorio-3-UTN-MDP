package app;

public class Musica extends Elemento{
	
	private int cantidadDeTemas;

	public Musica(String titulo, double duracion, String autor, boolean favorito, String comentario, int cantidaddetemas) {
		super(titulo, duracion, autor, favorito, comentario);
		cantidadDeTemas = cantidaddetemas;
		
	}

	@Override
	public String imprimir() {
		return "Musica [cantidadDeTemas=" + cantidadDeTemas + "] "+super.imprimir();
	}
	
	/*
	@Override
	public String imprimir() {
		return "Musica [cantidadDeTemas=" + cantidadDeTemas + "];
	}
	*/
	

	
}
