package DoMe;

public class Genero {

	private String tipoGenero;

	
	
	public Genero(String tipoGenero) {
		super();
		this.tipoGenero = tipoGenero;
	}

	public String getTipoGenero() {
		return tipoGenero;
	}

	public void setTipoGenero(String tipoGenero) {
		this.tipoGenero = tipoGenero;
	}

	@Override
	public String toString() {
		return " genero=" + tipoGenero;
	}
	
	
}
