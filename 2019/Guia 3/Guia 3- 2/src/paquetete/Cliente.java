package paquetete;

public class Cliente 
{
	private int id;
	private String nombre; 
	private char genero;
	
	public Cliente () {
		setId(0);
		setNombre(" ");
		setGenero(' ');
	}
	
	public Cliente (int idR, String nombreR, char generoR) {
		setId(idR);
		setNombre(nombreR);
		setGenero(generoR);
	}
	
	private int getId() {
		return id;
	}
	private void setId(int idR) {
		id = idR;
	}
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombreR) {
		nombre = nombreR;
	}
	private char getGenero() {
		return genero;
	}
	private void setGenero(char generoR) {
		genero = generoR;
	}
	
	
	@Override
	public String toString() {
		return "\nIdentificador: " +getId()+ "\nNombre: " +getNombre()+ "\nGenero: " +getGenero();
	}
	
}
