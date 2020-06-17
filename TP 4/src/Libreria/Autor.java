package Libreria;

public class Autor {
	
	private String nombre;
	private String apellido;
	private String email;
	private String genero;
	
	
	public Autor(String nombre, String apellido, String email, String genero) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.genero = genero;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return ": " + nombre + " " + apellido + " Email:" + email + " Genero:" + genero;
	}
	
}
