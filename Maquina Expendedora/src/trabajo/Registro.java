package trabajo;

public class Registro {
	private int registroDeBoletos;
	private float registroRecaudado;
	
	public Registro(){
		setRegistroDeBoletos(0);
		setRegistroRecaudado(0);
	}
	
	public int getRegistroDeBoletos() {
		return registroDeBoletos;
	}
	public void setRegistroDeBoletos(int registroDeBoletosRecividos) {
		registroDeBoletos = registroDeBoletosRecividos;
	}
	public float getRegistroRecaudado() {
		return registroRecaudado;
	}
	public void setRegistroRecaudado(float registroRecaudadoRecividos) {
		registroRecaudado = registroRecaudadoRecividos;
	}
}
