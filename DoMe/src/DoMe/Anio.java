package DoMe;

public class Anio {

	private String anio;

	
	
	public Anio(String anio) {
		
		this.anio = anio;
	}

	public String getAnios() {
		return anio;
	}

	public void setAnios(String anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return " anio=" + anio;
	}
	
	
	
}
