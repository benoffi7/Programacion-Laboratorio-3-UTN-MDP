package DoMe;

public class Premio {
	
	private String lugar;
	private String tipo;
	
	
	public Premio(String lugar, String tipo) {
		super();
		this.lugar = lugar;
		this.tipo = tipo;
	}
	
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return " lugar=" + lugar + " tipo=" + tipo;
	}
	
	
}
