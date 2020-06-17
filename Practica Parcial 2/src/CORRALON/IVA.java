package CORRALON;

public class IVA {
	
	private String tipo;
	
	public IVA(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "\n IVA [tipo=" + tipo + "]";
	}
	
	
}
