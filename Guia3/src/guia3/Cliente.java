package guia3;

public class Cliente {
	//
	private int id;
	private String nombre;
	private String genero;
	//
	public Cliente(){
		setId(0);
		setNombre("");
		setGenero("");
	}
	public Cliente(int idR, String nombreR, String generoR){
		setId(idR);
		setNombre(nombreR);
		setGenero(generoR);
	}
	public int getId() {
		return id;
	}
	public void setId(int idR) {
		id = idR;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombreR) {
		nombre = nombreR;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String generoR) {
		genero = generoR;
	}
	public String ToString (){
		return "\nID:"+getId()+"\nNombre:"+getNombre()+"\nGenero:"+getGenero();
	}
}
