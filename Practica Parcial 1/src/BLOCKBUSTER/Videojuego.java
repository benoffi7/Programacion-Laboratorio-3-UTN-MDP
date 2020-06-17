package BLOCKBUSTER;

public class Videojuego extends ElementoMultimedia {

	private double horasEstimadas;
	private String compania;
	
	
	public Videojuego(String titulo, String genero, boolean entregado, int codigo, int cantidad, double horasEstimadas,
			String compania) {
		super(titulo, genero, entregado, codigo, cantidad);
		this.horasEstimadas = 10;
		this.compania = compania;
	}
	public Videojuego(String titulo, String genero, int codigo, int cantidad, double horasEstimadas,
			String compania) {
		super(titulo, genero, codigo, cantidad);
		this.horasEstimadas=10;
		this.compania=compania;
	}
	
	
	
	public double getHorasEstimadas() {
		return horasEstimadas;
	}
	public void setHorasEstimadas(double horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
	@Override
	public String toString() {
		return " horasEstimadas=" + horasEstimadas + " compania=" + compania+super.toString();
	}

	
	
}
