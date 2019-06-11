package guia3;

public class Autor {
	//
	private String nombre;
	private String apellido;
	private String email;
	private String genero;
	//
	
	//
	public Autor (String nombreRecivido, String apellidoRecivido, String emailRecivido, String generoRecivido){
		setNombre(nombreRecivido);
		setApellido(apellidoRecivido);
		setEmail(emailRecivido);
		setGenero(generoRecivido);
	}
	//
	private String getNombre() {
		return nombre;
	}
	private void setNombre(String nombreRecivido) {
		nombre = nombreRecivido;
	}
	private String getApellido() {
		return apellido;
	}
	private void setApellido(String apellidoRecivido) {
		apellido = apellidoRecivido;
	}
	private String getEmail() {
		return email;
	}
	private void setEmail(String emailRecivido) {
		email = emailRecivido;
	}
	private String getGenero() {
		return genero;
	}
	private void setGenero (String generoRecivido) {
		genero = generoRecivido;
	}
	//
	public String toString (){
		return "El autor se llama: "+imprimirNombreCompleto()+"\nGenero: "+getGenero()+"\nMail: "+getEmail();
	}
	public String imprimirNombreCompleto (){
		return getNombre() + " " + getApellido();
	}
}
