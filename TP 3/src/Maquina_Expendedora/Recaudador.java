package Maquina_Expendedora;

public class Recaudador {
	
	MaquinaDeBoletos dada;
	private String nombre;
	private String pass;
	
	public Recaudador(String pass, String nombre) {
		this.nombre = nombre;
		this.pass = pass;
	}
	
	
	public MaquinaDeBoletos getDada() {
		return dada;
	}

	public void setDada(MaquinaDeBoletos dada) {
		this.dada = dada;
	}


	public String getNombre() {
		return nombre;
	}


	private void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPass() {
		return pass;
	}


	private void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public boolean equals(Object obj) {
		Recaudador r = (Recaudador) obj;
		if(r instanceof Object && obj != null){
			if(nombre==r.getNombre() && pass == r.getPass()) {
				return true;
			}
			else {
				return false;
			}
		}else {
			return false;
		}
	}
	// nombre.equals(recaudador.getNombre()) && pass.equals(recaudador.getPass())
}
