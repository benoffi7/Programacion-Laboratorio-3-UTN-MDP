package DoMe;

public class Sub {
	
	private String idioma;

	
	public Sub(String idioma) {
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
