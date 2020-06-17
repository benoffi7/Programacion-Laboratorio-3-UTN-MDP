package DoMe;

public class Clasificacion {
	
	private String tipoClasificacion;

	
	public Clasificacion(String tipoClasificacion) {
		super();
		this.tipoClasificacion = tipoClasificacion;
	}

	public String getTipoClasificacion() {
		return tipoClasificacion;
	}

	public void setTipoClasificacion(String tipoClasificacion) {
		this.tipoClasificacion = tipoClasificacion;
	}

	@Override
	public String toString() {
		return " clasificacion=" + tipoClasificacion;
	}
	
	
	
}
