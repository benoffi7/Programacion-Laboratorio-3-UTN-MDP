package CuentaBancaria;

public class Cliente {
	
	private int id;
	private String nombre; 
	private String apellido;
	private String genero;
	
	
	public Cliente(int id, String nombre, String apellido, String genero) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	@Override
	public String toString() {
		return " id: " + id + " nombre: " + nombre + " apellido: " + apellido + " genero :" + genero;
	}
	
	
}
