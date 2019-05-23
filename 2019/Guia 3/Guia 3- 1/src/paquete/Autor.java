package paquete;

public class Autor 
{
	private String nombre;
	private String apellido;
	private String email;
	private char genero;
	
	public Autor (String nombreR, String apellidoR, String emailR, char generoR ) {
		setNombre(nombreR);
		setApellido(apellidoR);
		setEmail(emailR);
		setGenero(generoR);
	}
	
	
	private String getNombre() {
		return nombre;
	}
	private void setNombre(String nombreR) {
		nombre = nombreR;
	}
	private String getApellido() {
		return apellido;
	}
	private void setApellido(String apellidoR) {
		apellido = apellidoR;
	}
	private String getEmail() {
		return email;
	}
	private void setEmail(String emailR) {
		email = emailR;
	}
	private char getGenero() {
		return genero;
	}
	private void setGenero(char generoR) {
		genero = generoR;
	}
	
	@Override
	public String toString() {
	 return "\nNombre: " +getNombre()+ "\nApellido: " +getApellido()+ "\nEmail: " +getEmail()+ "\nGenero: " +getGenero();
	}
	
	public String getNyA () {
		return getNombre() + " " + getApellido();
	}
	
}