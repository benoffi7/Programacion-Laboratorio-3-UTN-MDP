package app;

public class Persona implements Cloneable{
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public Persona(String nombre) {
		this.nombre = nombre;
	}
}
