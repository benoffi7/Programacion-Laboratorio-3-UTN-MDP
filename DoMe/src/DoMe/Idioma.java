package DoMe;

public class Idioma {
	
	private String idioma;

	
	
	public Idioma(String idioma) {
		super();
		this.idioma = idioma;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	@Override
	public String toString() {
		return " idioma=" + idioma;
	}
	
	
	
}
